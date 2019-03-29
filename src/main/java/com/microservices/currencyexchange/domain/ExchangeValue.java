package com.microservices.currencyexchange.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
@Entity
public class ExchangeValue {

    @Id
    private Long id;
    @Column(name="currency_from")
    private String from;
    @Column(name="currency_to")
    private String to;
    private BigDecimal convertion;
    private int port;

    public ExchangeValue() {
    }

    public ExchangeValue(long id, String from, String to, BigDecimal convertion) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convertion = convertion;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConvertion() {
        return convertion;
    }

    public void setConvertion(BigDecimal convertion) {
        this.convertion = convertion;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
