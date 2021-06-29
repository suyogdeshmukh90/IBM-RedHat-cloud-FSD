package org.demo.spring_hibernate_integration.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Data
public class Book {
	@Id
	@Column(name="book_id")
	private int bookId;
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_price")
	private Double bookPrice;

}
