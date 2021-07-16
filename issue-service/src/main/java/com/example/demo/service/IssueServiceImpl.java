package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.IssueNotFoundException;
import com.example.demo.model.Issue;
import com.example.demo.model.Severity;
import com.example.demo.repo.IssueRepository;

import lombok.extern.slf4j.Slf4j;



@Service
@Slf4j
public class IssueServiceImpl implements IssueService{

	private IssueRepository issueRepo;
	@Autowired
	public IssueServiceImpl(IssueRepository issueRepo) {
		
		this.issueRepo = issueRepo;
	}

	@Override
	public Issue createIssue(Issue issue) {
		log.info("Within create issue service.");
		return issueRepo.insert(issue);
		
	}

	@Override
	public List<Issue> getAllIssues() {
		log.info("Within getAll issue service.");
		List<Issue> list=issueRepo.findAll();
		return list;
	}

	@Override
	public Issue findIssueById(String id) {
		log.info("Within find Issue issue service.");
		Issue issue2=issueRepo.findById(id).get();
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		
		return issue2;
	}
	@Override
	public Issue updateIssue(String id, Issue issue)
	{
		log.info("Within update Issue issue service.");
		Issue issue2=issueRepo.findById(id).get();
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		issue2.setAssignee(issue.getAssignee());
		issue2.setDescription(issue.getDescription());
		issue2.setSeverity(issue.getSeverity());
		issueRepo.save(issue2);
		return issue2;
	}
	
	@Override
	public String deleteIssue(String id)
	{
		log.info("Within delete Issue issue service.");
		Issue issue2=issueRepo.findById(id).get();
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		issueRepo.delete(issue2);
		return "Issue Deleted Successfully!";
	}

	@Override
	public Issue findIssueByAssignee(String assignee) {
		log.info("Within find By Assignee Issue service.");
		Issue issue2=issueRepo.findIssueByAssignee(assignee);
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		return issue2;
	}

	@Override
	public List<Issue> findIssueBySeverity(Severity severity) {
		log.info("Within find By Assignee Issue service.");
		List<Issue> issues=issueRepo.findIssueBySeverity(severity);
		if(issues.isEmpty())
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		return issues;
	}

	@Override
	public Issue findIssueByDescription(String description) {
		log.info("Within find By Description Issue service.");
		Issue issue2=issueRepo.findIssueByDescription(description);
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		return issue2;
	}

	@Override
	public Issue updateIssueByAssignee(String assignee, Issue issue) {
		log.info("Within update Issue By Assignee issue service.");
		Issue issue2=issueRepo.findIssueByAssignee(assignee);
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		issue2.setId(issue.getId());
		issue2.setDescription(issue.getDescription());
		issue2.setSeverity(issue.getSeverity());
		issueRepo.save(issue2);
		return issue2;
	}

	@Override
	public Issue updateIssueByDescription(String description, Issue issue) {
		log.info("Within update Issue By Description issue service.");
		Issue issue2=issueRepo.findIssueByDescription(description);
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		issue2.setId(issue.getId());
		issue2.setAssignee(issue.getAssignee());
		issue2.setSeverity(issue.getSeverity());
		issueRepo.save(issue2);
		return issue2;
	}

	@Override
	public String deleteIssueByAssignee(String assignee) {
		log.info("Within delete Issue issue service.");
		Issue issue2=issueRepo.findIssueByAssignee(assignee);
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		issueRepo.delete(issue2);
		return "Issue Deleted Successfully!";
	}

	@Override
	public String deleteIssueByDescription(String description) {
		log.info("Within delete Issue issue service.");
		Issue issue2=issueRepo.findIssueByDescription(description);
		if(issue2==null)
		{
			throw new IssueNotFoundException("Issue with given Id not found!");
		}
		issueRepo.delete(issue2);
		return "Issue Deleted Successfully!";
	}
	
	
}
