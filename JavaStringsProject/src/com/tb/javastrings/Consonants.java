package com.tb.javastrings;

import java.util.ArrayList;

public class Consonants {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy brown dog";
		ArrayList<Character> vowels = new ArrayList();
		int cCount = 0;
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		
		for(int i = 0; i < sentence.length(); i++) {
			if(!vowels.contains(sentence.charAt(i)) & sentence.charAt(i) != ' ') {
				cCount++;
				sentence.replace(sentence.charAt(i), '*');
			}
		}
		System.out.println("There are " + cCount + " consonants in the sentence");
		System.out.println(sentence);
	}

}
