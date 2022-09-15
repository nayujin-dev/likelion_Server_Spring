package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class ListPrac {
    public static void main(String[] args){
        List<String> newList = new ArrayList<>();
        newList.add("멋사의 봄 Spring");
        newList.add("화요일의 봄 Likelion");
        System.out.println(newList);
        System.out.println(newList.get(0));
        System.out.println(newList.get(1));
        newList.remove(0);
        System.out.println(newList);
    }
}
