package com.camunda.connectors.repository;

import com.camunda.connectors.domain.Vacation;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.UUID;

public interface VacationRepository extends ElasticsearchRepository<Vacation, UUID> {

}
