package com.example.demo.domain;

import org.aspectj.weaver.patterns.TypePatternQuestions;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "survey")
public class Survey implements Serializable {

    private Long _id;

    private String _name;

    private List<TypePatternQuestions.Question> _questions;


    /**
     * @return survey's id.
     */
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "survey_id", unique = true, nullable = false)
    public Long getId() {
        return _id;
    }

    /**
     * @return the survey name.
     */
    @Column(name = "name")
    public String getName() {
        return _name;
    }


    /**
     * @return a list of survey questions.
     */
    @OneToMany(mappedBy = "survey")
    @OrderBy("id")
    public List<TypePatternQuestions.Question> getQuestions() {
        return _questions;
    }

    /**
     * @param id the id to set to.
     */
    public void setId(Long id) {
        _id = id;
    }

    /**
     * @param name the name for the question.
     */
    public void setName(final String name) {
        _name = name;
    }

    /**
     * @param questions list of questions to set.
     */
    public void setQuestions(List<TypePatternQuestions.Question> questions) {
        _questions = questions;
    }
}