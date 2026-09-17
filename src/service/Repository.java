package edu.cam.service;

import edu.cam.domain.*;
import java.util.*;

public class Repository {
    private static final Repository INSTANCE=new Repository();
    private final Map<String, Student> students=new HashMap<>();
    private final Map<String, Course> courses=new HashMap<>();
    private Repository(){}
    public static Repository get(){ return INSTANCE; }
    public Map<String, Student> students(){ return students; }
    public Map<String, Course> courses(){ return courses; }
}
