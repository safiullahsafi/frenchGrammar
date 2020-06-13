package com.language.grammar.domain.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Letter  extends BaseEntity{

    @OneToMany
    private List<Blank> blanks;
}
