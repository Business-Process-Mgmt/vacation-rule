package com.camunda.connectors.service;

import com.camunda.connectors.domain.VacationRule;
import com.camunda.connectors.repository.VacationRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VacationRuleService {

    @Autowired
    VacationRuleRepository vacationRuleRepository;
    public VacationRule saveVacationRule( VacationRule vacationRule) {
        VacationRule vacationRuleResponse=vacationRuleRepository.save(vacationRule);
        return vacationRuleResponse;

    }
}
