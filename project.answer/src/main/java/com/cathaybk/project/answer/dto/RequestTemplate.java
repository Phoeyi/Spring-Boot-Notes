package com.cathaybk.project.answer.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestTemplate<S> {

    @Valid
    @NotNull
    @JsonProperty("TRANRQ")
    private S tranrq;

    public S getTranrq() {
        return tranrq;
    }

    public void setTranrq(S tranrq) {
        this.tranrq = tranrq;
    }
}
