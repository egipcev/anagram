package Anagram;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	System.out.print("Input text to be reversed: ");
	String inputText = scanner.nextLine();
	scanner.close();
	Anagram anagram = new Anagram();

	try {
	    System.out.print("Reversed text: " + anagram.getReversedText(inputText));
	} catch (IllegalArgumentException ex) {
	    System.out.print(ex.getMessage());
	} catch (RuntimeException ex) {
	    System.out.print("System error");
	}

    }

}