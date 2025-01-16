package com.desafioAlura.restApiForoHubChallenge.entity;



import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "answers")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_answer")
    private Long idAnswer;

    // Foreign Key
    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;

    // Foreign Key
    @ManyToOne
    @JoinColumn(name = "id_topic")
    private TopicEntity topicEntity;

    private String message;

    @Column(name = "creation_date")
    private LocalDateTime creationDate;

    public AnswerEntity(UserEntity userEntity, TopicEntity topicEntity, String message,
                        LocalDateTime creationDate, LocalDateTime lastEditedAt, Boolean activeStatus) {
        this.userEntity = userEntity;
        this.topicEntity = topicEntity;
        this.message = message;
        this.creationDate = creationDate;
        this.lastEditedAt = lastEditedAt;
        this.activeStatus = activeStatus;
    }


    public Long getIdAnswer() {
        return idAnswer;
    }

    public void setIdAnswer(Long idAnswer) {
        this.idAnswer = idAnswer;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public TopicEntity getTopicEntity() {
        return topicEntity;
    }

    public void setTopicEntity(TopicEntity topicEntity) {
        this.topicEntity = topicEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastEditedAt() {
        return lastEditedAt;
    }

    public void setLastEditedAt(LocalDateTime lastEditedAt) {
        this.lastEditedAt = lastEditedAt;
    }

    public Boolean getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(Boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Column(name = "last_edited_at")
    private LocalDateTime lastEditedAt;

    @Column(name = "active_status")
    private Boolean activeStatus;
}

