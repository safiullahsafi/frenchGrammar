package com.language.grammar.domain.port;


import com.language.grammar.domain.model.Unit;

import java.util.List;
import java.util.Optional;

public interface UnitRepository {
    Optional<Unit> findById(Long releaseId);

    void delete(Long releaseId);

    Unit saveOrUpdate(Unit unit);

    List<Unit> getUnits();
}
