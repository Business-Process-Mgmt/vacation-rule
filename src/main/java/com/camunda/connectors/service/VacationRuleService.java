package com.camunda.connectors.service;

import com.camunda.connectors.domain.VacationRule;
import com.camunda.connectors.repository.VacationRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class VacationRuleService {

    @Autowired
    VacationRuleRepository vacationRuleRepository;
    public VacationRule saveVacationRule( VacationRule vacationRule) {
        VacationRule vacationRuleResponse=vacationRuleRepository.save(vacationRule);
        return vacationRuleResponse;

    }
}
