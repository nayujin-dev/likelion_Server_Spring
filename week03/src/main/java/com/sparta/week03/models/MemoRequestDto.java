package com.sparta.week03.models;


import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MemoRequestDto {
    private String username;
    private String contents;

    public MemoRequestDto(String username, String contents) {
        this.username = username;
        this.contents = contents;
    }
}
