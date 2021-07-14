package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Issue;
import com.example.demo.model.Severity;

public interface IssueService {
	public Issue createIssue(Issue issue);
	public List<Issue> getAllIssues();
	public Issue findIssueById(String id);
	public Issue updateIssue(String id,Issue issue);
	public String deleteIssue(String id);
	public Issue findIssueByAssignee(String assignee);
	public Issue findIssueByDescription(String description);
	public List<Issue> findIssueBySeverity(Severity severity);
	public Issue updateIssueByAssignee(String assignee,Issue issue);
	public Issue updateIssueByDescription(String description,Issue issue);
	public String deleteIssueByAssignee(String assignee);
	public String deleteIssueByDescription(String description);


	
}
