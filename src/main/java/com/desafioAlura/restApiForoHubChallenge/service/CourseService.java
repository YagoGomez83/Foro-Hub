package com.desafioAlura.restApiForoHubChallenge.service;


import com.desafioAlura.restApiForoHubChallenge.entity.CourseEntity;
import com.desafioAlura.restApiForoHubChallenge.exception.ValidationException;
import com.desafioAlura.restApiForoHubChallenge.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public CourseEntity findById(Long idCourse) {

        if (!courseRepository.existsById(idCourse)) {
            throw new ValidationException("This course does not exist.");
        }
        return courseRepository.getReferenceById(idCourse);
    }
}

