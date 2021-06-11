package com.example.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import com.example.Beer;

public class App {

	public static void main(String[] args) {
		//implementing generic using collections
		//Specifying the type of the collection
		Set<Beer> set=new HashSet<Beer>();
		set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		set.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		System.out.println(set);
		List<Beer> list=new ArrayList<Beer>();
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		list.add(new Beer(UUID.randomUUID().toString(), "Beer-1", 190));
		System.out.println(list);
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(10);
		set1.add(10);
		set1.add(9);
		set1.add(20);
		set1.add(8);
		set1.add(50);
		System.out.println(set1);
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(10);
		list1.add(9);
		list1.add(20);
		list1.add(8);
		list1.add(50);
		System.out.println(list1);
		

	}

}