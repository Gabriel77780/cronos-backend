package dev.gabrielvasquez.controller;

import dev.gabrielvasquez.model.Question;
import dev.gabrielvasquez.service.QuestionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    public final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping(path = "/create")
    public void saveQuestion(@RequestBody Question question) {
        questionService.saveQuestion(question);
    }

    @DeleteMapping(path = "/{questionId}")
    public void deleteQuestionById(@PathVariable String questionId) {
        questionService.deleteQuestion(questionId);
    }

}
