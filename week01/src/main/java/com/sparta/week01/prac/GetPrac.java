package com.sparta.week01.prac;

import java.util.ArrayList;
import java.util.List;

public class GetPrac {
    public static void main(String []args){
        List<String> mySubject = new ArrayList<>();
        mySubject.add("웨이트트레이닝");
        mySubject.add("컴퓨터그래픽스");
        mySubject.add("알고리즘");
        mySubject.add("컴퓨터네트워크");
        mySubject.add("데이터베이스설계와질의");
        mySubject.add("패션치료심리학");
        for (int i=0; i<mySubject.size();i++){
            String each = mySubject.get(i);
            System.out.println("내가 듣는 "+(i+1)+"번째 수업은 "+each);
        }
    }
}
