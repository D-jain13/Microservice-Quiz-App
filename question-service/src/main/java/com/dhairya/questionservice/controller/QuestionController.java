package com.dhairya.questionservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dhairya.questionservice.entity.Question;
import com.dhairya.questionservice.service.QuestionService;

@RestController
@RequestMapping("question")
public class QuestionController {
	
	
	@Autowired
	QuestionService questionService;
	
	@GetMapping("allQuestion")
	public ResponseEntity<List<Question>> getAllQuestions(){
		return questionService.getAllQuestions();
		
	}
}
