package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    // 글 작성
    public void write(Board board){

        boardRepository.save(board);
    }

    // 글 작성 처리
    public List<Board> boardList() {

        return boardRepository.findAll();
    }

    // 글 불러오기
    public Board boardView(Integer id) {

        return boardRepository.findById(id).get();
    }

    // 글 삭제
    public void boardDelete(Integer id) {

        boardRepository.deleteById(id);
    }
}
