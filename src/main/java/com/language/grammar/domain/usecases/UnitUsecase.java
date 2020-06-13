package com.language.grammar.domain.usecases;




import com.language.grammar.domain.model.Unit;
import com.language.grammar.domain.port.UnitRepository;

import java.util.List;

public class UnitUsecase {

    private UnitRepository unitRepository;

    public UnitUsecase(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }


    public Unit saveOrUpdate(Unit unit) {
       return unitRepository.saveOrUpdate(unit);
    }

    public List<Unit> getUnits() {
        return unitRepository.getUnits();
    }


    public void delete(Long unitId) {
        unitRepository.delete(unitId);
    }
}
