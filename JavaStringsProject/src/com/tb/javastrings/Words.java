package com.tb.javastrings;

public class Words {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumps over the lazy dog";
		String[] words = sentence.split(" ");
		System.out.println(sentence);
		System.out.println("There are " + words.length + " words in the sentence");
	}

}
