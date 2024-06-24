package org.microplacements;

public class Palindrome {
	public Palindrome() {
		
	}
	
	public boolean palindromeChecker(char[] word) {
		char[] reversedWord = new char[word.length];
		int j = 0;
		boolean palindrome = false;
		if(word.length == 0) {
			palindrome = true;
		}
		
		for(int i = word.length -1; i >= 0; i--) {
			reversedWord[j] = word[i];
			j++;
		}
		
		for(int i = word.length -1; i >= 0; i--) {
			if(word[i] != reversedWord[i]) {
				palindrome = false;
				break;
			}
			palindrome = true;
		}
		
		return palindrome;
	}
	
	
}
