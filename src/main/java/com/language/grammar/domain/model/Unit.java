package com.language.grammar.domain.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Unit extends BaseEntity {

    private String name;
    @OneToMany
    private List<Dossier> dossier;
}
