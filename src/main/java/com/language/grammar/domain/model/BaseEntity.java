package com.language.grammar.domain.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * See: https://stackoverflow.com/questions/48784923/is-using-id-field-in-allargsconstructor-while-using-spring-jpa-correct
 * @author developer
 */
@Entity
@Data
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    public BaseEntity() {
    }
}