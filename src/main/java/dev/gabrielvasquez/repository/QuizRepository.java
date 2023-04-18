package dev.gabrielvasquez.repository;

import dev.gabrielvasquez.model.Quiz;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends MongoRepository<Quiz, String> {

    Quiz findQuizById(String id);

}
