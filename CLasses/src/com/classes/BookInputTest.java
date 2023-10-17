package com.classes;

import java.util.Scanner;

public class BookInputTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Book book  = new Book();
		System.out.println("Please enter the title of the book");
		book.title = scanner.nextLine();
		System.out.println("Please enter the author name");
		book.author = scanner.nextLine();
		System.out.println("Please enter the number of pages");
		book.numberOfPages = scanner.nextInt();
		
		System.out.println("The book title is: "+book.title);
		System.out.println("The book author is: "+book.author);
		System.out.println("The book has "+ book.numberOfPages+" pages");

	}

}
