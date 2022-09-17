package com.spartahw.hw1.controller;

import com.spartahw.hw1.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getMyinfo(){
        Person nayujin = new Person();
        nayujin.setAge(24);
        nayujin.setMajor("Computer Science");
        nayujin.setName("나는유진");
        return nayujin;
    }
}
