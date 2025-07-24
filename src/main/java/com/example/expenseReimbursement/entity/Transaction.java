package com.example.expenseReimbursement.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;

    @ManyToOne
    @JoinColumn(name = "report_id")
    private ExpenseReport report;

    @ManyToOne
    @JoinColumn(name = "paid_by")
    private Employee paidBy;

    private LocalDateTime paidAt;

    private BigDecimal amount;

    private String fromAccount;

    private String toAccount;

    private String remark;
}