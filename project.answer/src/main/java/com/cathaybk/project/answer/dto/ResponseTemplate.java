package com.cathaybk.project.answer.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
//@NoArgsConstructer
//@AllArgsConstructor
public class ResponseTemplate<S> {

    @JsonProperty("PRHEADER")
    private PrHeader prHeaderResponse;

    @JsonProperty("MESSAGE")
    private String message;

    @JsonProperty("TRANRS")
    private S tranrs;

    public ResponseTemplate(PrHeader prHeaderResponse) {
        this.prHeaderResponse = prHeaderResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public S getTranrs() {
        return tranrs;
    }

    public void setTranrs(S tranrs) {
        this.tranrs = tranrs;
    }

}
