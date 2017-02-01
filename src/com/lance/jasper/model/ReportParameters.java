package com.lance.jasper.model;

import java.util.Date;
import java.util.List;

public class ReportParameters {

	private Date reportDate;
	private String name;
	private List<String> stuff;

	public ReportParameters() {
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getStuff() {
		return stuff;
	}

	public void setStuff(List<String> stuff) {
		this.stuff = stuff;
	}

}
