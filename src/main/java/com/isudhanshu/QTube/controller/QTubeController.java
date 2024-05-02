package com.isudhanshu.QTube.controller;

import com.isudhanshu.QTube.model.Question;
import com.isudhanshu.QTube.service.QTubeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")

public class QTubeController {

    @Autowired
    QTubeService qTubeService;

    // Read operation
    @GetMapping("all")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return qTubeService.getAllQuestions();
    }

    // Read operation for a specific category
    @GetMapping("category/{category}")
    public ResponseEntity <List<Question>> getQuestionsByCategory(@PathVariable String category){
        return qTubeService.getQuestionsByCategory(category);
    }

    //TODO also "&" and "||" operations in fetching data

    //Create/Add operation (Save in Db)
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
        return qTubeService.addQuestion(question);
    }

    //TODO - Update operation
    //TODO - Delete operation
}
