package com.camunda.connectors.domain;

import java.time.LocalDate;
import java.util.UUID;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.*;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "vacation-Rule")
@Data
public class VacationRule {
    @Id
    private UUID id;

    @Field(type = FieldType.Text)
    private String employeeId;

    @Field(type = FieldType.Date, format = DateFormat.date)
    private LocalDate vacationStartDate;

    @Field(type = FieldType.Date, format = DateFormat.date)
    private LocalDate vacationEndDate;

    @Field(type = FieldType.Text)
    private String reassignType;

    @Field(type = FieldType.Text)
    private String reassignTo;

    @Field(type = FieldType.Text)
    private String delegateTo;
}
