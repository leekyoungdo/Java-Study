package com.sesac.seasspring.mybatis.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BoardDTO {
    private int boardID;
    private String title;
    private String content;
    private String writer;
    private String registered;
    private int no;
}
