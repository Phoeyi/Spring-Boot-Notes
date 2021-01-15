package com.cathaybk.project.answer.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlAccessorType(XmlAccessType.FIELD)
//@NoArgsConstructer
//@AllArgsConstructor
public class ResponseTemplate<S> {
	
	@JsonProperty("PRHEADER")
	private PrHeaderResponse prHeaderResponse;
	
	@JsonProperty("TRANRS")
	private S tranrs;
	
	public ResponseTemplate(PrHeaderResponse prHeaderResponse) {
		this.prHeaderResponse = prHeaderResponse;
	}

}
