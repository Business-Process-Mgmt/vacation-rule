package com.camunda.connectors.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="TBL_OUT_OF_OFFICE")
@Data
public class VacationRule {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID Id;
    @Column(name="employee_id")
    private String employeeId;
    @Column(name="vacation_start_date")
    private LocalDate vacationStartDate ;
    @Column(name="vacation_end_date")
    private LocalDate vacationEndDate ;
    @Column(name="reassign_type")
    private String reassignType ;
    @Column(name="reassign_to")
    private String reassignTo ;
    @Column(name="delegate_to")
    private String delegateTo ;
}
