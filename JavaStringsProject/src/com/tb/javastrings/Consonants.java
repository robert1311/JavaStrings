package com.tb.javastrings;

import java.util.ArrayList;

public class Consonants {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy brown dog";
		ArrayList<Character> vowels = new ArrayList();
		int cCount = 0;
		String newSentence ="";
		char newChar = '*';
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		for(int i = 0; i < sentence.length(); i++) {
			char currentChar = sentence.charAt(i);
			if(!vowels.contains(currentChar) & sentence.charAt(i) != ' ') {
				cCount++;
				currentChar = newChar;
			}
			newSentence += currentChar;
		}
		System.out.println("Current Sentence:");
		System.out.println(sentence);
		System.out.println("There are " + cCount + " consonants in this sentence\n");
		System.out.println("The consonants have been replaced with " + newChar 
				+ " in the sentence below. \n" + newSentence);
	}

}
