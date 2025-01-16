package com.desafioAlura.restApiForoHubChallenge.validations;



import com.desafioAlura.restApiForoHubChallenge.dto.TopicReceivedDTO;
import com.desafioAlura.restApiForoHubChallenge.exception.ValidationException;
import com.desafioAlura.restApiForoHubChallenge.repository.TopicRepository;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;


@Component
public class ValidateTitleAndMessage implements TopicValidator {

    @Autowired
    private TopicRepository topicRepository;

    @Override
    public void validate(TopicReceivedDTO topicReceivedDTO) {
        // Regla de negocio: No puede haber un topico con el titulo o el mensaje repetido.
        Boolean titleExist = topicRepository.existsByTitle(topicReceivedDTO.title());
        Boolean messageExist = topicRepository.existsByMessage(topicReceivedDTO.message());

        if (titleExist || messageExist) {
            throw new ValidationException("This topic already exists.");
        }
    }
}
