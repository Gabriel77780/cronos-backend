package dev.gabrielvasquez.service.implementation;

import dev.gabrielvasquez.model.Quiz;
import dev.gabrielvasquez.repository.QuizRepository;
import dev.gabrielvasquez.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizServiceImpl implements QuizService {

    private final QuizRepository quizRepository;

    public QuizServiceImpl(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }


    @Override
    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    @Override
    public Quiz findQuizById(String id){

        return quizRepository.findQuizById(id);

    }

    @Override
    public void saveQuiz(Quiz quiz) {
        quizRepository.save(quiz);
    }

    @Override
    public void deleteQuizById(String id) {
        quizRepository.deleteById(id);
    }
}
