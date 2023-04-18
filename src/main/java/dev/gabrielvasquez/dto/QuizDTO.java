package dev.gabrielvasquez.dto;

import dev.gabrielvasquez.model.Question;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(builderClassName = "Builder", toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class QuizDTO {

    String quizName;

    List<Question> questions;

}
