package com.sparta.week01.controller;

import com.sparta.week01.prac.SetterPrac;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    //localhost:8080주소 뒤에 /courses라고 하면 getCourses 메소드가 실행됨
    @GetMapping("/courses")
    public SetterPrac getCourses() {
        SetterPrac course = new SetterPrac();
        course.setTitle("웹개발의 봄 스프링");
        course.setDays(35);
        course.setTutor("나나나유진");
        return course;
    }
}