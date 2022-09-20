package com.spartahw.hw2.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class PersonRequestDto {
    private String name;
    private String major;
    private int age;

    public PersonRequestDto(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age= age;
    }
}
