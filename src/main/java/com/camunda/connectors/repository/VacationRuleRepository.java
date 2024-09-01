package com.camunda.connectors.repository;

import com.camunda.connectors.domain.VacationRule;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface  VacationRuleRepository extends ElasticsearchRepository<VacationRule, Long> {

}
