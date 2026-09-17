package edu.cam.domain;

public class Instructor extends Person {
    private String department;

    public Instructor(String id, String name, String email, String dept){
        super(id, name, email);
        this.department = dept;
    }

    @Override
    public String info(){
        return String.format("Instructor %s (%s) - %s", name, id, department);
    }
}
