package edu.cam.domain;

import java.util.*;

public class Student extends Person {
    public enum Status { ACTIVE, DISABLED }

    private String rollNo;
    private Status status = Status.ACTIVE;
    private final Map<String, Enrollment> enrollmentMap = new LinkedHashMap<>();

    public Student(String id, String rollNo, String name, String email){
        super(id, name, email);
        this.rollNo = rollNo;
    }

    public void enroll(Enrollment e){ enrollmentMap.put(e.getCourse().getCode(), e); }
    public void remove(String courseCode){ enrollmentMap.remove(courseCode); }
    public Collection<Enrollment> getEnrollments(){ return enrollmentMap.values(); }
    public void disable(){ this.status = Status.DISABLED; }

    @Override
    public String info(){
        StringBuilder sb = new StringBuilder();
        sb.append("Student: ").append(name).append(" (").append(rollNo).append(")\n");
        sb.append("Email: ").append(email).append(" Status: ").append(status).append("\n");
        enrollmentMap.values().forEach(e-> sb.append(" - ").append(e.summary()).append("\n"));
        return sb.toString();
    }
}
