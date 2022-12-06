package com.nest.courseapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "courses")
public class Course {
    private int id;
    private String course_title;
    private String course_description;
    private String course_venue;
    private String course_duration;
    private String course_date;

    public Course() {
    }

    public Course(int id, String course_title, String course_description, String course_venue, String course_duration, String course_date) {
        this.id = id;
        this.course_title = course_title;
        this.course_description = course_description;
        this.course_venue = course_venue;
        this.course_duration = course_duration;
        this.course_date = course_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse_title() {
        return course_title;
    }

    public void setCourse_title(String course_title) {
        this.course_title = course_title;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }

    public String getCourse_venue() {
        return course_venue;
    }

    public void setCourse_venue(String course_venue) {
        this.course_venue = course_venue;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_date() {
        return course_date;
    }

    public void setCourse_date(String course_date) {
        this.course_date = course_date;
    }
}
