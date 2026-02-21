package com.assignment;

public class Lead {
private Long leadId;
private String source;
private String status;
public Long getLeadId() {
	return leadId;
}
public void setLeadId(Long leadId) {
	this.leadId = leadId;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Lead [leadId=" + leadId + ", source=" + source + ", status=" + status + "]";
}

}
