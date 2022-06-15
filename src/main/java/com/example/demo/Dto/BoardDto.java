package com.example.demo.Dto;


import com.example.demo.Entity.Board;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long board_id;
    private String title;
    private String content;

    public static BoardDto toEntity(Board board)
    {
        return BoardDto.builder()
                .board_id(board.getBoard_id())
                .title(board.getTitle())
                .content(board.getContents())
                .build();
    }

    @Builder
    public BoardDto(Long board_id, String title,String content)
    {
        this.board_id=board_id;
        this.content=content;
        this.title=title;
    }

}
