package com.assignment;

public class SupportTicket {
private Long ticketId;
private String issue;
private String status;
public Long getTicketId() {
	return ticketId;
}
@Override
public String toString() {
	return "SupportTicket [ticketId=" + ticketId + ", issue=" + issue + ", status=" + status + "]";
}
public void setTicketId(Long ticketId) {
	this.ticketId = ticketId;
}
public String getIssue() {
	return issue;
}
public void setIssue(String issue) {
	this.issue = issue;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
}
