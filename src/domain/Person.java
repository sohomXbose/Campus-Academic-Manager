package edu.cam.domain;

import java.time.LocalDate;

public abstract class Person {
    protected String id;
    protected String name;
    protected String email;
    protected LocalDate created;

    protected Person(String id, String name, String email){
        this.id = id;
        this.name = name;
        this.email = email;
        this.created = LocalDate.now();
    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public String getEmail(){ return email; }

    public abstract String info();
}
