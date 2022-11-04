package com.example.project1;

import org.springframework.stereotype.Component;

@Component
public class Course {
    private String course_name;
    private int course_duration;

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(int course_duration) {
        this.course_duration = course_duration;
    }
    public void display(){
        System.out.println("In display method");
    }
}
