package com.tb.javastrings;

public class Vowels {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
		char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		int count = 0;
		
		for(int i = 0; i < sentence.length(); i++) {
			for(int j = 0; j < vowels.length; j++) {
				if(sentence.charAt(i) == vowels[j]) {
				count++;
				}
			}
		}
		System.out.println(count);
	}

}
