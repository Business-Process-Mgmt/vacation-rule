package com.camunda.connectors.config;


import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.CustomHeaders;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import io.camunda.zeebe.spring.client.annotation.VariablesAsType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class OutOfOfficeConfig {
    /*private static final String BPMN_ERROR_EVENT = "ERROR_EXP_01";
    @JobWorker(type="error-event-worker")
    public void trackInvoiceServiceTask1(
            final JobClient jobClient,
            final ActivatedJob job,
            @VariablesAsType Map<String,Object> variables,
            @CustomHeaders Map<String,String> headers
    ) {

    }*/
}
