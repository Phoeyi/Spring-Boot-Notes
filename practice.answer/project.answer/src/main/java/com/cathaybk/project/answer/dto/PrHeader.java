package com.cathaybk.project.answer.dto;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

//@Data
//@NoArgsConstructor
public class PrHeader {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	
	@JsonProperty("SID")
	private String SID;
	
	public PrHeader() {
		this.SID = sdf.format(new Timestamp(new Date().getTime()));
	}
}
