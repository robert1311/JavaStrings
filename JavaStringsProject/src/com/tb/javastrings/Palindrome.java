package com.tb.javastrings;

public class Palindrome {

	public static void main(String[] args) {
		String word = "noon";
		int checkLength;
		int pCount = 0;
		if(word.length() %2 != 0) {
			checkLength = (int) (word.length() - 1) / 2;
		} else {
			checkLength = (int) word.length()/2;
		}
		
		for(int i = 0; i < checkLength; i++) {
			if(word.charAt(i) == word.charAt(word.length() - 1 -i)) {
				pCount++;
			}
		}
		System.out.println(pCount == checkLength ? "is Palindrome" : "NOT Palindrome");
		
	}

}
