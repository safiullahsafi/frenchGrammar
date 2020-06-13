package com.language.grammar.infrastructure.jpa;


import com.language.grammar.domain.model.Unit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitJpaRepository extends JpaRepository<Unit, Long> {

}
