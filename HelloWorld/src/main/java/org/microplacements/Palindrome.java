package org.microplacements;

public class Palindrome {
    public Palindrome() { }
    
    public boolean palindromeChecker(char[] word) {
        if(word.length == 0) { 
            return true; 
        }
        char[] reversedWord = reverse(word);

        for(int i = word.length -1; i >= 0; i--) {
            if(word[i] != reversedWord[i]) {
                return false;
            }
        }   
       
        return true;
    }
    public boolean palindromeCheckerV2(char[] word) {
        if(word.length < 2) { 
            return true; 
        }
        int numIterations = getNumIterations(word.length);
        
        for(int i = 0; i < numIterations; i++) {
            if(word[i] != word[word.length - 1 - i]) {
                return false;
            }
        }
        
        return true;
    }
    
    private int getNumIterations(int len) {
        if(len % 2 != 0) {
            return (len - 1) / 2;
        }
        return len / 2;
    }
    
    public char[] reverse(char[] word) {
        char[] reversedWord = new char[word.length];
        int i = word.length - 1;
        for(char letter : word) {
            reversedWord[i] = letter;
            i--;
        }
        return reversedWord;
    }
}
