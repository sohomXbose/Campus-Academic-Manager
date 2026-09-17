package edu.cam.service;

import edu.cam.domain.*;
import java.util.*;

public class StudentManager {
    private final Repository repo=Repository.get();

    public Student add(String id,String roll,String name,String email){
        Student s=new Student(id,roll,name,email);
        repo.students().put(id,s);
        return s;
    }

    public Optional<Student> find(String id){ return Optional.ofNullable(repo.students().get(id)); }
    public List<Student> list(){ return new ArrayList<>(repo.students().values()); }
}
