package com.example.demo.Controller;

import com.example.demo.Dto.BoardDto;
import com.example.demo.Entity.Board;
import com.example.demo.Repository.BoardRepositroy;
import com.example.demo.Service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/")
@AllArgsConstructor
@Log
public class BoardController {
    private final BoardRepositroy boardRepositroy;
    private final BoardService boardService;

    @GetMapping("/board")
    public List<Board> ReadBoard()
    {
        return boardService.ReadBoard();

    }
    @PostMapping("/board/post")
    public List<BoardDto> saveBoard(BoardDto boardDto)
    {
        if(boardDto.getTitle() == null)
        {
            log.info("error");
        }
        return boardService.CreatePost();
    }

    @DeleteMapping("/board/{id}")
    public void DeletePosts(@PathVariable Long id)
    {
        boardService.DeleteBoard(id);
    }

}
