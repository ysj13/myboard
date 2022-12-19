package com.sj.board.myboard.repository;

import com.sj.board.myboard.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
