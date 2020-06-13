package com.language.grammar.infrastructure.controller;


import com.language.grammar.domain.model.Unit;
import com.language.grammar.domain.usecases.UnitUsecase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UnitController {
    private UnitUsecase unitUsecase;

    public UnitController(UnitUsecase unitUsecase) {
        this.unitUsecase = unitUsecase;
    }

    @GetMapping(value = "/unit", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity getAll() {
        return new ResponseEntity(unitUsecase.getUnits(), HttpStatus.OK);
    }
    @PostMapping(value = "/unit", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity save(@RequestBody Unit unit) {
        return new ResponseEntity(unitUsecase.saveOrUpdate(unit), HttpStatus.CREATED);

    }
    @DeleteMapping("unit/{id}")
    public ResponseEntity delete(@PathVariable Long id) {
        unitUsecase.delete(id);
        return new ResponseEntity("successfully deleted", HttpStatus.ACCEPTED);

    }


}

