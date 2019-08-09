package com.iamvickyav.sbootdocker.db;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name = "ORDER_TABLE")
public class Order {

    @Column(name = "ORDER_ID")
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "PRODUCT_NAME")
    private String name;

    @Column(name = "BRAND")
    private String brand;

    @Column(name = "CUST_ID")
    private String custId;

    @Column(name = "CREATED")
    private Timestamp created;

    private Order() {
    }

    public Order(String productName, String brand, String custId) {
        this.name = productName;
        this.brand = brand;
        this.custId = custId;
        this.created = new Timestamp(Instant.now().toEpochMilli());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
