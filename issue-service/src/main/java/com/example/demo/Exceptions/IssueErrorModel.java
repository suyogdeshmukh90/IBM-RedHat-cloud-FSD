package com.example.demo.Exceptions;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class IssueErrorModel {
	private String message;
	private Integer statusCode;
	private Long errprReportingTime;

}
