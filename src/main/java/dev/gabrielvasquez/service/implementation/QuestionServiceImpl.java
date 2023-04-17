package dev.gabrielvasquez.service.implementation;

import dev.gabrielvasquez.model.Question;
import dev.gabrielvasquez.repository.QuestionRepository;
import dev.gabrielvasquez.service.QuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    public void saveQuestion(Question question) {
        questionRepository.save(question);
    }

    public void deleteQuestion(String id) {
        questionRepository.deleteById(id);
    }

}
