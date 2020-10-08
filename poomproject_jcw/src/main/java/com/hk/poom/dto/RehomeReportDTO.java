package com.hk.poom.dto;

public class RehomeReportDTO {
	int bno;
	String report_cont;
	int reportcnt;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getReport_cont() {
		return report_cont;
	}
	public void setReport_cont(String report_cont) {
		this.report_cont = report_cont;
	}
	
	public int getReportcnt() {
		return reportcnt;
	}
	public void setReportcnt(int reportcnt) {
		this.reportcnt = reportcnt;
	}
	@Override
	public String toString() {
		return "RehomeReportDTO [bno=" + bno + ", report_cont=" + report_cont + ", reportcnt=" + reportcnt + "]";
	}
}
