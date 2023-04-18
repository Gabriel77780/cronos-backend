package dev.gabrielvasquez.service;

import dev.gabrielvasquez.model.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAllQuestions();

    void saveQuestion(Question question);

    void deleteQuestion(String id);

}
