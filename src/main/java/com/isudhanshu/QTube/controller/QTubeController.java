package com.isudhanshu.QTube.controller;

import com.isudhanshu.QTube.model.Question;
import com.isudhanshu.QTube.service.QTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")

public class QTubeController {

    @Autowired
    QTubeService qTubeService;

    @GetMapping("all")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return qTubeService.getAllQuestions();
    }
}
