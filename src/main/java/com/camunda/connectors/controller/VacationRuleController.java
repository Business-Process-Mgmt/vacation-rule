package com.camunda.connectors.controller;

import com.camunda.connectors.domain.Vacation;
import com.camunda.connectors.service.VacationRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/vacations")
public class VacationRuleController {
    @Autowired
    VacationRuleService vacationService;
    @PostMapping
    public ResponseEntity<Vacation> saveVacation(@RequestBody Vacation vacation) {
        Vacation savedVacation = vacationService.saveVacation(vacation);
        return ResponseEntity.ok(savedVacation);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vacation> getVacationById(@PathVariable UUID id) {
        Optional<Vacation> vacation = vacationService.getVacationById(id);
        return vacation.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<Vacation>> getAllVacations() {
        List<Vacation> vacations = vacationService.getAllVacations();
        return ResponseEntity.ok(vacations);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVacation(@PathVariable UUID id) {
        vacationService.deleteVacation(id);
        return ResponseEntity.noContent().build();
    }
    @DeleteMapping
    public ResponseEntity<Void> deleteAllVacations() {
        vacationService.deleteAllVacations();
        return ResponseEntity.noContent().build();
    }
}
