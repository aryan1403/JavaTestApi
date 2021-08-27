package com.example.springrest.DB;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Course {
    @Field(name = "cname")
    private String coursename;

    public Course(String coursename) {
        this.coursename = coursename;
    }
    
    public void setcoursename(String coursename) {
        this.coursename = coursename;
    }
}
