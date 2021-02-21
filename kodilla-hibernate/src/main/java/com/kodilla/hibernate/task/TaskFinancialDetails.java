package com.kodilla.hibernate.task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "TASKS_FINANCIALS")
public class TaskFinancialDetails {

    private int id;
    private BigDecimal price;
    private boolean paid;

    public TaskFinancialDetails() {
    }

    public TaskFinancialDetails(BigDecimal price, boolean paid) {
        this.price = price;
        this.paid = paid;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Table(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Table(name = "PRICE")
    public BigDecimal getPrice() {
        return price;
    }

    @Table(name = "")
    public boolean isPaid() {
        return paid;
    }
}
