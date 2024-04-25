package com.isudhanshu.QTube.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")

public class QTubeController {

    @GetMapping("all")
    public String getAllQuestions(){
        return "Ghazab";
    }
}
