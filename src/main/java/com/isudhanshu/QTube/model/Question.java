package com.isudhanshu.QTube.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="questiontitle")
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    @Column(name="rightanswer")
    private String rightAnswer;
    @Column(name="difficultylevel")
    private String difficultyLevel;
    private String category;
}