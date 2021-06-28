package com.example.spring_jdbc_template.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Book {

	private Integer bookId;
	private String bookName;
	private Double bookPrice;
	public void displayAllBook() {
		System.out.println(bookId+"\t"+bookName+"\t"+bookPrice);
		System.out.println("\n");
	}

}
