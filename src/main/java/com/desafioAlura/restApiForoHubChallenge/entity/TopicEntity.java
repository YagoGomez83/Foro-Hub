package com.desafioAlura.restApiForoHubChallenge.entity;


import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "topics")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class TopicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_topic")
    private Long idTopic;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_course")
    private CourseEntity courseEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_user")
    private UserEntity userEntity;

    private String message;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    public TopicEntity(Long idTopic, String title, CourseEntity courseEntity, UserEntity userEntity,
                       String message, LocalDateTime createdDate, LocalDateTime lastEditedAt, Boolean activeStatus) {
        this.idTopic = idTopic;
        this.title = title;
        this.courseEntity = courseEntity;
        this.userEntity = userEntity;
        this.message = message;
        this.createdDate = createdDate;
        this.lastEditedAt = lastEditedAt;
        this.activeStatus = activeStatus;
    }

    public Long getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(Long idTopic) {
        this.idTopic = idTopic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CourseEntity getCourseEntity() {
        return courseEntity;
    }

    public void setCourseEntity(CourseEntity courseEntity) {
        this.courseEntity = courseEntity;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
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

