package com.kanhaiya.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {

	@Value("#{employee.employeeName}")
	private String panHolder;
	@Value("ABDFCFC34")
	private String panNo;
	public String getPanHolder() {
		return panHolder;
	}
	public void setPanHolder(String panHolder) {
		this.panHolder = panHolder;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
}
