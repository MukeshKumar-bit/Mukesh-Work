package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTheDuplicateElement {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,2,3,4,3,3,4);
		//Find the duplicate element int the list
		list.stream().filter(e->Collections.frequency(list,e)>1).distinct().forEach(System.out::println);
		
		
		
	}

}
