package com.spartahw.hw1;

public class Person {
    private String name;
    private String major;
    private int age;
    public void setName(String name){
        this.name=name;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String getMajor(){
        return this.major;
    }
    public int getAge(){
        return this.age;
    }
}
