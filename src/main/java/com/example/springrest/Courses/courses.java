package com.example.springrest.Courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class courses implements course{
    List<String> list = new ArrayList<>();

    @Override
    public String addCouse(String coursename) {
        if(list.toString().contains(coursename)) {
            return coursename+" is Already Present";
        }
        else list.add(coursename);
        return "Successfully Added "+coursename;
    }

    @Override
    public String getCourse() {
        return list.toString();
    }

    @Override
    public String getCourse(String coursename) {
        if(list.toString().contains(coursename)) {
            return coursename+" is Present";
        }
        else  {
            return coursename+ " is not Present";
        }
    }
}
