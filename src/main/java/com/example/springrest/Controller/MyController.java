package com.example.springrest.Controller;

import com.example.springrest.Courses.course;
import com.example.springrest.Services.IData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private course c;

    @GetMapping("/home")
    public String home() {
        return "Welcome to Home!";
    }

    @GetMapping("/name/{myname}")
    public String shoutName(@PathVariable String myname){
        return myname;
    }

    @GetMapping("/get")
    public String getCourse() {
        return c.getCourse();
    }

    @GetMapping("/get/{coursename}")
    public String getCoursePresence(@PathVariable String coursename) {
        return c.getCourse(coursename);
    }

    @GetMapping("/add/{coursename}")
    public String addCourse(@PathVariable String coursename) {
        return c.addCouse(coursename);
    }

    @GetMapping("/data/{username}")
    public String Data(@PathVariable String username) {
        return new IData().getData(username);
    }

    @GetMapping("/joke")
    public String joke(){
        return new IData().getJoke();
    }
}
