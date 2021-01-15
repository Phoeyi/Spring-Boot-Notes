package com.cathaybk.project.answer.dto;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerResponse {

    @JsonProperty(value = "Datas")
    private List<Data> datas;

    public List<Data> getDatas() {
        return datas;
    }

    public void setDatas(List<Data> datas) {
        this.datas = datas;
    }

    public static class Data {

        @JsonProperty(value = "CUSTOMER_ID")
        private Long customerID;

        @JsonProperty(value = "NAME")
        private String name;

        @JsonProperty(value = "BIRTHDAY")
        private Date birthDay;

        @JsonProperty(value = "SEX")
        private String sex;

        @JsonProperty(value = "ID")
        private String id;

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

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
