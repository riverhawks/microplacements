package org.microplacements;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    void testWordIsNotPalindrome() {
        Palindrome p = new Palindrome();
        char[] arr = {'w','o','r','d'};

        boolean actual = p.palindromeChecker(arr);
        
        assertFalse(actual);
    }

    @Test
    void testWordIsPalindrome() {
        Palindrome p = new Palindrome();
        char[] arr = {'a','n','n','a'};

        boolean actual = p.palindromeChecker(arr);
        
        assertTrue(actual);
    }
    
    @Test
    void testRacecarIsPalindrome() {
        Palindrome p = new Palindrome();
        char[] arr = {'r','a','c','e','c','a','r'};

        boolean actual = p.palindromeChecker(arr);
        
        assertTrue(actual);
    }
    
    @Test
    void testNoInput() {
        Palindrome p = new Palindrome();
        char[] arr = {};

        boolean actual = p.palindromeChecker(arr);
        
        assertTrue(actual);
    }
    
    @Test
    void testOneInput() {
        Palindrome p = new Palindrome();
        char[] arr = {'a'};

        boolean actual = p.palindromeChecker(arr);
        
        assertTrue(actual);
    }
    
    @Test
    void testNumberIsNotPalindrome() {
        Palindrome p = new Palindrome();
        char[] arr = {'1','2','3'};

        boolean actual = p.palindromeChecker(arr);
        
        assertFalse(actual);
    }
    
    @Test
    void testNumberIsPalindrome() {
        Palindrome p = new Palindrome();
        char[] arr = {'1','2','1'};

        boolean actual = p.palindromeChecker(arr);
        
        assertTrue(actual);
    }
    
    @Test
    void testRepeatedNumberIsPalindrome() {
        Palindrome p = new Palindrome();
        char[] arr = {'1','1','1','1','1'};

        boolean actual = p.palindromeChecker(arr);
        
        assertTrue(actual);
    }
}
