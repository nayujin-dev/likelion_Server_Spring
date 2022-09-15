package com.sparta.week01.prac;

import java.awt.*;

public class Prac {
    public static void main(String[] args){
        System.out.println("우헤헹");
        ClassPrac course = new ClassPrac();
        course.title="서버의 봄, Spring";
        System.out.println(course.title);
        System.out.println(course.tutor);

        SetterPrac course2 = new SetterPrac();
        System.out.println(course2.getTitle());

        course2.setTitle("일교시 수업 싫어");
        course2.setTutor("컴퓨터그래픽스");
        course2.setDays(35);

        System.out.println(course2.getTitle());
        System.out.println(course2.getTutor());
        System.out.println(course2.getDays());
    }
}
