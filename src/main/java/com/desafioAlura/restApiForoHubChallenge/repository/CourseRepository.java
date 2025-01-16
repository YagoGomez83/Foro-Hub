package com.desafioAlura.restApiForoHubChallenge.repository;



import com.desafioAlura.restApiForoHubChallenge.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
}
