package com.desafioAlura.restApiForoHubChallenge.entity;



import lombok.Getter;
import java.util.List;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode
public class CourseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_course")
    private Long idCourse;

    private String name;

    public Long getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Long idCourse) {
        this.idCourse = idCourse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseCategory getCategory() {
        return category;
    }

    public void setCategory(CourseCategory category) {
        this.category = category;
    }

    public List<TopicEntity> getTopics() {
        return topics;
    }

    public void setTopics(List<TopicEntity> topics) {
        this.topics = topics;
    }

    @Enumerated(EnumType.STRING)
    private CourseCategory category;

    @OneToMany(mappedBy = "courseEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TopicEntity> topics;


    public CourseEntity(Long idCourse, String name, CourseCategory category) {
        this.idCourse = idCourse;
        this.name = name;
        this.category = category;
    }
}
