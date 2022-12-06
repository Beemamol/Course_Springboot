package com.nest.courseapp_backend.controller;

import com.nest.courseapp_backend.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @GetMapping("/")
    public String HomePage()
    {

        return "Welcome to My Website";
    }
@PostMapping(path = "/add",consumes = "application/json",produces = "application/json")
    public String AddCourse(@RequestBody Course c){
        System.out.println(c.getCourse_title().toString());
        System.out.println(c.getCourse_description().toString());
        System.out.println(c.getCourse_venue().toString());
        System.out.println(c.getCourse_duration().toString());
        System.out.println(c.getCourse_date().toString());
        return  "Course Added Sucessfully";
}
}
