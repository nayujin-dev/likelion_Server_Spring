package com.spartahw.hw2.domain;

import com.spartahw.hw2.models.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본생성자를 대신 생성해줍니다.
@Entity // 테이블임을 나타냅니다.
public class Person {
    @Id // ID 값, Primary Key로 사용하겠다는 뜻입니다.
    @GeneratedValue(strategy = GenerationType.AUTO) // 자동 증가 명령입니다.
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String major;

    @Column(nullable = false)
    private int age;

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.major = requestDto.getMajor();
        this.age= requestDto.getAge();
    }
    public Person(String name, String major, int age) {
        this.name = name;
        this.major = major;
        this.age= age;
    }
    public Person(PersonRequestDto requestDto){
        this.major=requestDto.getMajor();
        this.name= requestDto.getName();
        this.age= requestDto.getAge();
    }

}