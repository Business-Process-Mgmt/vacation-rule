package com.camunda.connectors.service;

import com.camunda.connectors.domain.Vacation;
import com.camunda.connectors.repository.VacationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.List;
import java.util.Optional;


@Service
public class VacationRuleService {

    @Autowired
    VacationRepository vacationRepository;

    public Vacation saveVacation(Vacation vacation) {
        vacation.setId(UUID.randomUUID());
        return vacationRepository.save(vacation);
    }

    public Optional<Vacation> getVacationById(UUID id) {
        return vacationRepository.findById(id);
    }

    public List<Vacation> getAllVacations() {
        return (List<Vacation>) vacationRepository.findAll();
    }

    public void deleteVacation(UUID id) {
        vacationRepository.deleteById(id);
    }
    public void deleteAllVacations() {
        vacationRepository.deleteAll();
    }
}
