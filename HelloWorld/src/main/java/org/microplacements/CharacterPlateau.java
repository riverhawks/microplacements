package org.microplacements;

public class CharacterPlateau {
    public CharacterPlateau() {}
    
    public int characterPlateauCounterInt(String word) {

        int counter = 1;
        int highestCount = 0;
        char currentLetter;
        
        if(word.length() <= 0) {
            return 0;            
        } else if(word.length() == 1) {
            return 1;
        }
        
        currentLetter = word.charAt(0);
        
        for(int i = 1; i < word.length(); i++) {
            if(currentLetter == word.charAt(i)) {
                counter++;
                if(counter > highestCount) {
                    highestCount = counter;
                }
            } else {
                counter = 1;
            }
            
            currentLetter = word.charAt(i);
        }
   
        return highestCount;
    }
    
    public String characterPlateauCounter(String word) {
        int counter = 1;
        int highestCount = 0;
        String longestPlateau = "";
        String currentPlateau = "";
        char currentLetter;
        
        
        if(word.length() <= 0) {
            return "";            
        } else if(word.length() == 1) {
            longestPlateau += word.charAt(0);
            return longestPlateau;
        }
        
        currentLetter = word.charAt(0);
        currentPlateau += currentLetter;
        
        for(int i = 1; i < word.length(); i++) {
            if(currentLetter == word.charAt(i)) {
                counter++;
                currentPlateau += currentLetter;
                if(counter > highestCount) {
                    highestCount = counter;
                    longestPlateau = currentPlateau;
                }
            } else {
                currentPlateau = "" + word.charAt(i);
                counter = 1;
            }
            
            currentLetter = word.charAt(i);
        }
   
        return longestPlateau;
    }
}
