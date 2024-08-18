package com.camunda.connectors.repository;

import com.camunda.connectors.domain.VacationRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  VacationRuleRepository extends JpaRepository<VacationRule, Long> {

}
