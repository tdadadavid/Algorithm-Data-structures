package com.company;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class Dota2_senate_649 {
    public static void main(String[] args) {

    }


    public String predictPartyVictory(String senate){
        CharacterIterator iterator = new StringCharacterIterator(senate);
        boolean banStatus = false;

        while (iterator.current() != CharacterIterator.DONE) {
           if (iterator.current() == 'R'){
               banStatus = true;
               if (banStatus) {
                   iterator.next();
               }
           }
        }
    }
}
