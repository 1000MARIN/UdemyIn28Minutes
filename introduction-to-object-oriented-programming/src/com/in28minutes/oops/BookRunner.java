package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		// Create a new class called Book
		// Create three instances
		
		Book artOfComputherProgramming = new Book(100);
		Book effectivaJava = new Book(50);
		Book cleanCode = new Book(40);
		
		artOfComputherProgramming.setNoOfCopies(100);
		effectivaJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(45);
		
	}

}
