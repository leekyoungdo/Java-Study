package com.sesac.seasspring.jpaboard.service;

import com.sesac.seasspring.jpaboard.domain.Board;
import com.sesac.seasspring.jpaboard.dto.BoardDTO;
import com.sesac.seasspring.jpaboard.entity.BoardEntity;
import com.sesac.seasspring.jpaboard.mapper.BoardJpaMapper;
import com.sesac.seasspring.jpaboard.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BoardJpaService {
//    @Autowired
////    BoardJpaMapper boardMapper;
    @Autowired
    BoardRepository boardRepository;

    public List<BoardDTO> getBoardAll(){
        //List<Board> result = boardMapper.getBoardAll();

        List<BoardEntity> jpaResult = boardRepository.findAll();
        List<BoardDTO> boards = new ArrayList<>();

        for (BoardEntity boardEntity : jpaResult) {
            BoardDTO boardDTO = new BoardDTO();
            boardDTO.setBoardID(boardEntity.getId());
            boardDTO.setTitle(boardEntity.getTitle());
            boardDTO.setContent(boardEntity.getContent());
            boardDTO.setWriter(boardEntity.getWriter());
            // string으로 반환
            boardDTO.setRegistered(new SimpleDateFormat("yyyy-mm-dd").format(boardEntity.getRegistered()));
            // 1) DTO의 값을 timestamp 변경
            // 2) timestamp -> String 파싱하거나 ( SimpleDateFormat )
            boardDTO.setNo(100 + boardEntity.getId());
            boards.add(boardDTO);
        }


//        for ( Board board : result ){
//            BoardDTO boardDTO = new BoardDTO();
//            boardDTO.setBoardID(board.getId());
//            boardDTO.setTitle(board.getTitle());
//            boardDTO.setContent(board.getContent());
//            boardDTO.setWriter(board.getWriter());
//            boardDTO.setRegistered(board.getRegistered());
//            boardDTO.setNo(100 + board.getId());
//            boards.add(boardDTO);
//        }
        return boards;
    }
    public boolean insertBoard(BoardDTO boardDTO) {
        // save(
         BoardEntity boardEntity = BoardEntity.builder()
                 .title(boardDTO.getTitle())
                 .content(boardDTO.getContent())
                 .writer(boardDTO.getWriter()).build();
         boardRepository.save(boardEntity);

//        Board board = new Board();
//        board.setTitle(boardDTO.getTitle());
//        board.setContent(boardDTO.getContent());
//        board.setWriter(boardDTO.getWriter());
//
//        boardMapper.insertBoard(board);
        return true;
    }

    public void patchBoard(BoardDTO boardDTO) {
        // save()
        BoardEntity boardEntity = boardRepository.findById(boardDTO.getBoardID())
                .orElseThrow(()->new NoSuchElementException("board  patch : id is wrong"));
        BoardEntity modified = BoardEntity.builder()
                .id(boardEntity.getId())
                .title(boardDTO.getTitle())
                .content(boardDTO.getContent())
                .writer(boardDTO.getWriter())
                .registered(boardEntity.getRegistered())
                .build();
        boardRepository.save(modified);

        // board.getBoardID // title, content, writer
//        Board board = new Board();
//        board.setId(boardDTO.getBoardID()); // update의 where
//        board.setTitle(boardDTO.getTitle());
//        board.setContent(boardDTO.getContent());
//        board.setWriter(boardDTO.getWriter());
//        boardMapper.patchBoard(board);
    }
    public void deleteBoard(int id){
        BoardEntity boardEntity = boardRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("board  patch : id is wrong"));
        boardRepository.delete(boardEntity);
        // 이 방법 보다는 위의 방법을 추천
        // boardRepository.deleteById((id));


//        boardMapper.deleteBoard(id);
    }

    public int searchBoard(String word) {
        List<BoardEntity> result =boardRepository.searchByWord(word);
//        List<Board> result = boardMapper.searchBoard(word);
        return result.size();
    }
}
