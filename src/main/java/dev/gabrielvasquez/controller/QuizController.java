package dev.gabrielvasquez.controller;

import dev.gabrielvasquez.dto.QuizDTO;
import dev.gabrielvasquez.model.Answer;
import dev.gabrielvasquez.model.Question;
import dev.gabrielvasquez.model.Quiz;
import dev.gabrielvasquez.service.QuizService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    public final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    @GetMapping(path = "/{quizId}")
    public Quiz findQuizById(@PathVariable String quizId) {



        return quizService.findQuizById(quizId);
    }

    @PostMapping(path = "/create")
    public void saveQuiz(@RequestBody Quiz quiz) {
        quizService.saveQuiz(quiz);
    }

    @DeleteMapping(path = "/{quizId}")
    public void deleteQuizById(@PathVariable String quizId) {
        quizService.deleteQuizById(quizId);
    }

}
