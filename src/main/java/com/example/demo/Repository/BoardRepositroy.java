package com.example.demo.Repository;

import com.example.demo.Entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepositroy extends JpaRepository<Board,Long>
{

}
