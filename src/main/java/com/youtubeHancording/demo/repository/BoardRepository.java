package com.youtubeHancording.demo.repository;


import com.youtubeHancording.demo.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface BoardRepository extends JpaRepository<Board,Integer> {
}
