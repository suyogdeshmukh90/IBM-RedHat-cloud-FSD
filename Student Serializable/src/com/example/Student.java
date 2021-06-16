package com.example;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Student implements Serializable,Comparable{
	private String id;
	private String name;
	private String grade;
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
	

}
