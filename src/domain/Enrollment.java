package edu.cam.domain;

import java.time.LocalDate;
import java.util.Optional;

public class Enrollment {
    private final Student student;
    private final Course course;
    private final LocalDate date;
    private Double score;

    public Enrollment(Student s, Course c){
        this.student=s; this.course=c; this.date=LocalDate.now();
    }
    public Course getCourse(){ return course; }
    public void setScore(Double sc){ this.score=sc; }
    public Optional<Double> getScore(){ return Optional.ofNullable(score); }
    public Grade grade(){ return score==null?null:Grade.fromScore(score); }
    public String summary(){ return course.getCode()+" - "+course.getTitle()+" : "+(score==null?"N/A":score); }
}
