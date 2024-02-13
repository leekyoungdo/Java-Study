package com.sesac.seasspring.jpa.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class StudentDTO {
    private String name;
    private String nickname;
}
