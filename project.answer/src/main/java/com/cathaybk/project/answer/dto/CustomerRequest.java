package com.cathaybk.project.answer.dto;

import java.sql.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerRequest {

    @Valid
    @NotNull(message = "客戶ID不得為空")
    @JsonProperty(value = "CUSTOMER_ID")
    private Long customerID;

    @JsonProperty(value = "NAME")
    private String name;

    @JsonProperty(value = "BIRTHDAY")
    private Date birthDay;

    @JsonProperty(value = "SEX")
    private String sex;

    @JsonProperty(value = "ID")
    private String ID;

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
