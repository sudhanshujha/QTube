package com.isudhanshu.QTube.dao;

import com.isudhanshu.QTube.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QTubeRepo extends JpaRepository<Question,Integer> {

    List<Question>findQuestionsByCategory(String category);
}
