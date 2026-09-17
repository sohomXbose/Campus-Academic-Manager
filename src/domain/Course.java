package edu.cam.domain;

public class Course {
    private final String code;
    private final String title;
    private final int credits;
    private final String instructor;
    private final Semester sem;
    private final String dept;

    private Course(Builder b){
        this.code=b.code; this.title=b.title; this.credits=b.credits;
        this.instructor=b.instructor; this.sem=b.sem; this.dept=b.dept;
    }

    public String getCode(){ return code; }
    public String getTitle(){ return title; }
    public int getCredits(){ return credits; }
    public String getInstructor(){ return instructor; }
    public Semester getSemester(){ return sem; }
    public String getDept(){ return dept; }

    @Override public String toString(){ return code+":"+title+" ("+credits+"cr) - "+dept; }

    public static class Builder {
        private String code, title="Untitled", instructor="NA", dept="General";
        private int credits=3;
        private Semester sem=Semester.SPRING;
        public Builder(String c){ this.code=c; }
        public Builder title(String t){ this.title=t; return this; }
        public Builder credits(int c){ this.credits=c; return this; }
        public Builder instructor(String i){ this.instructor=i; return this; }
        public Builder dept(String d){ this.dept=d; return this; }
        public Builder semester(Semester s){ this.sem=s; return this; }
        public Course build(){ return new Course(this); }
    }
}
