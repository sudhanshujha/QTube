package com.isudhanshu.QTube.dao;

import com.isudhanshu.QTube.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QTubeRepo extends JpaRepository<Question,Integer> {

}
