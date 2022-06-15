package com.example.demo.Service;

import com.example.demo.Dto.BoardDto;
import com.example.demo.Entity.Board;
import com.example.demo.Repository.BoardRepositroy;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@NoArgsConstructor
public class BoardService {

    private BoardRepositroy boardRepositroy;

    @Transactional
    public List<BoardDto>CreatePost()
    {
        return boardRepositroy.findAll().
                stream().map(BoardDto::toEntity).collect(Collectors.toList());
    }

    @Transactional
    public List<Board> ReadBoard()
    {
        return boardRepositroy.findAll();
    }

    @Transactional
    public void DeleteBoard(Long id)
    {
        boardRepositroy.deleteById(id);


    }

    @Transactional
    public  Board UpdateBoard(Board board)
    {
        return boardRepositroy.save(board);

    }

}
