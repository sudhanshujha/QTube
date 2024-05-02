package com.isudhanshu.QTube.service;

import com.isudhanshu.QTube.dao.QTubeRepo;
import com.isudhanshu.QTube.model.Question;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QTubeService {

    private static final Logger log = LoggerFactory.getLogger(QTubeService.class);
    @Autowired
    QTubeRepo qTubeRepo;

    public ResponseEntity<List<Question>> getAllQuestions() {
        try {
            return new ResponseEntity<>(qTubeRepo.findAll(), HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.BAD_REQUEST);
    }

    public List<Question> getQuestionsByCategory(String category) {
        return qTubeRepo.findQuestionsByCategory(category);
    }

    public String addQuestion(Question question) {
            qTubeRepo.save(question);
            return "success";
    }
}
