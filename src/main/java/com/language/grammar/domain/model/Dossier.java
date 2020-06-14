package com.language.grammar.domain.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Dossier extends BaseEntity {


    private String name;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<Subject> suject;
}
