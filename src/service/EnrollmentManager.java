package edu.cam.service;

import edu.cam.domain.*;
import java.util.*;

public class EnrollmentManager {
    private final Repository repo=Repository.get();

    public void enroll(String sid,String code){
        Student s=repo.students().get(sid);
        Course c=repo.courses().get(code);
        if(s==null||c==null) throw new RuntimeException("Invalid");
        s.enroll(new Enrollment(s,c));
    }
    public void record(String sid,String code,double score){
        Student s=repo.students().get(sid);
        if(s!=null){
            for(Enrollment e: s.getEnrollments()){
                if(e.getCourse().getCode().equals(code)){ e.setScore(score); }
            }
        }
    }
}
