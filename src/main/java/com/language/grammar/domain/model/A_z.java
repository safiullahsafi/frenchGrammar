package com.language.grammar.domain.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class A_z extends BaseEntity {

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Letter> letters;

}
