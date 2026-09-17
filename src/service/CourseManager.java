package edu.cam.service;

import edu.cam.domain.*;
import java.util.*;

public class CourseManager {
    private final Repository repo=Repository.get();
    public Course add(Course c){ repo.courses().put(c.getCode(), c); return c; }
    public List<Course> list(){ return new ArrayList<>(repo.courses().values()); }
}
