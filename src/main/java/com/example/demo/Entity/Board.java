package com.example.demo.Entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
@Entity
@Table
@Getter
@NoArgsConstructor
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long board_id;

    private String title;

    private String contents;

    @Builder
    public Board(Long board_id,String title,String contents)
    {
        this.board_id=board_id;
        this.title=title;
        this.contents=contents;


    }


}
