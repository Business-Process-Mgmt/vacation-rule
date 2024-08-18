package com.camunda.connectors.controller;

import com.camunda.connectors.domain.VacationRule;
import com.camunda.connectors.service.VacationRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class VacationRuleController {
    @Autowired
    VacationRuleService vacationRuleService;
    @PostMapping("/vacation-rule")
    public ResponseEntity<VacationRule> saveVacationRule(@RequestBody VacationRule vacationRule) {
        try {
            VacationRule vacationRuleResponse = vacationRuleService.saveVacationRule(vacationRule);
            return new ResponseEntity<>(vacationRuleResponse, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
