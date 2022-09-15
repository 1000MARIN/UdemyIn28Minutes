package com.in28minutes.oops;

public class Book {
	
	private int noOfCopies;
	
	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	
	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0)
			this.noOfCopies = noOfCopies;
	}
	
	public void increaseNoOfVopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);
	}

	public void decreaseNoOfVopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}
