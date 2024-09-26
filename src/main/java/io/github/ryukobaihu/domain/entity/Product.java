package io.github.ryukobaihu.domain.entity;

import java.math.BigDecimal;

public class Product {

    private Integer id;
    private String description;
    private BigDecimal unitaryPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getUnitary_price() {
        return unitaryPrice;
    }

    public void setUnitary_price(BigDecimal unitary_price) {
        this.unitaryPrice = unitaryPrice;
    }
}
