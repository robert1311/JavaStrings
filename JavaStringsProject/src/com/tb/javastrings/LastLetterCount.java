package com.tb.javastrings;

public class LastLetterCount {

	public static void main(String[] args) {
		String sentence = "Why do you say that they only fuss "
				+ "when it is a rainy day";
		String newSentence;
		//# of words that end in 's'
		int sCount = 0;
		String firstS = null;
		
		//# of words that in in 'y'
		int yCount = 0;
		String firstY = null;
		String[] words = sentence.split(" ");
		int firstSIndex = -1;
		int firstYIndex = -1;
		String temp;
		for(int i = 0; i < words.length; i++) {
			if(words[i].endsWith("s")) {
				sCount++;
				if(sCount == 1) {
					firstS = words[i];
					firstSIndex = i;
				}
			} else if(words[i].endsWith("y")) {
				yCount++;
				if(yCount == 1) {
					firstY = words[i];
					firstYIndex = i;
				}
			}
		}
		if(firstS != null & firstY != null) {
			temp = words[firstSIndex];
			words[firstSIndex] = words[firstYIndex];
			words[firstYIndex] = temp;
		}
		System.out.println("Original sentence:\n" + sentence);
		System.out.println("\nThere are " + sCount + " words that end "
				+ " with 's' and " + yCount + " words that end with 'y'");
		System.out.println("\nThe new sentence with swapped words is");
		for(String word: words) {
			System.out.print(word + " ");
		}
	}

}
