package dev.gabrielvasquez.service;

import dev.gabrielvasquez.model.Question;

import java.util.List;

public interface QuestionService {

    public List<Question> getAllQuestions();

    public void saveQuestion(Question question);

    void deleteQuestion(String id);

}
