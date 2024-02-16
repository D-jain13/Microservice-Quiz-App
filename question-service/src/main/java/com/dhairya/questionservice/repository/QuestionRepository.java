package com.dhairya.questionservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dhairya.questionservice.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

}
