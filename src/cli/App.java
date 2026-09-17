package edu.cam.cli;

import edu.cam.domain.*;
import edu.cam.service.*;

import java.util.*;

public class App {
    private static final Scanner sc=new Scanner(System.in);
    private static final StudentManager sm=new StudentManager();
    private static final CourseManager cm=new CourseManager();
    private static final EnrollmentManager em=new EnrollmentManager();

    public static void main(String[]args){
        seed();
        boolean run=true;
        while(run){
            System.out.println("\nCampus Academic Manager");
            System.out.println("1. Students 2. Courses 3. Enrollments 0. Exit");
            String op=sc.nextLine();
            switch(op){
                case "1":students();break;
                case "2":courses();break;
                case "3":enrollments();break;
                case "0":run=false;break;
                default:System.out.println("?");
            }
        }
    }

    private static void students(){
        System.out.println("1.Add 2.List 3.Info");
        String o=sc.nextLine();
        switch(o){
            case "1":
                System.out.print("id:");String id=sc.nextLine();
                System.out.print("roll:");String r=sc.nextLine();
                System.out.print("name:");String n=sc.nextLine();
                System.out.print("email:");String e=sc.nextLine();
                sm.add(id,r,n,e);break;
            case "2": sm.list().forEach(s->System.out.println(s.info())); break;
            case "3": System.out.print("id:");String sid=sc.nextLine(); sm.find(sid).ifPresent(s->System.out.println(s.info())); break;
        }
    }

    private static void courses(){
        System.out.println("1.Add 2.List");
        String o=sc.nextLine();
        switch(o){
            case "1":
                System.out.print("code:");String c=sc.nextLine();
                System.out.print("title:");String t=sc.nextLine();
                Course course=new Course.Builder(c).title(t).credits(3).instructor("Prof").dept("GEN").build();
                cm.add(course);break;
            case "2": cm.list().forEach(System.out::println);break;
        }
    }

    private static void enrollments(){
        System.out.println("1.Enroll 2.Record");
        String o=sc.nextLine();
        switch(o){
            case "1": System.out.print("sid:");String s=sc.nextLine();System.out.print("code:");String cc=sc.nextLine(); em.enroll(s,cc);break;
            case "2": System.out.print("sid:");String sid=sc.nextLine();System.out.print("code:");String cd=sc.nextLine();System.out.print("score:");double scv=Double.parseDouble(sc.nextLine());em.record(sid,cd,scv);break;
        }
    }

    private static void seed(){
        sm.add("u1","R001","Charlie","charlie@mail.com");
        sm.add("u2","R002","Diana","diana@mail.com");
        cm.add(new Course.Builder("M101").title("Maths").dept("Science").build());
        cm.add(new Course.Builder("H201").title("History").dept("Arts").build());
    }
}
