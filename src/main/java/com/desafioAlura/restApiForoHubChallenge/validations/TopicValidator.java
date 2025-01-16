package com.desafioAlura.restApiForoHubChallenge.validations;


import com.desafioAlura.restApiForoHubChallenge.dto.TopicReceivedDTO;

public interface TopicValidator {
    void validate(TopicReceivedDTO topicReceivedDTO);
}

