package dev.gabrielvasquez.service;

import dev.gabrielvasquez.model.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizService {

    List<Quiz> getAllQuizzes();

    Quiz findQuizById(String id);

    void saveQuiz(Quiz quiz);

    void deleteQuizById(String id);

}
