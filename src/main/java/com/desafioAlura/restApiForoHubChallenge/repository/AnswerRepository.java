package com.desafioAlura.restApiForoHubChallenge.repository;



import java.util.List;

import com.desafioAlura.restApiForoHubChallenge.entity.AnswerEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AnswerRepository extends JpaRepository<AnswerEntity, Long> {

    @Query(value = """
                   SELECT *
                   FROM answers
                   WHERE id_topic = :topicId AND active_status = TRUE
                   ORDER BY id_answer ASC
                   """, nativeQuery = true)
    List<AnswerEntity> getAnswersByIdTopic(Long topicId);
}

