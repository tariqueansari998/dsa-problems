package org.example.challenges;

import java.util.Arrays;

/**
 * Problem statement : Given a 16 digit credit card, this code intends to validate the credit card.
 * A credit card is valid if
 *      a) Traverse from right to left
 *      b) Double every other digit starting from 2nd last & sum each digit of all doubled number
 *      c) Add the remaining digtis
 *      d) Result modulo 10 should be 0
 */
public class CreditCardValidation {

    public boolean validateCreditCard(String creditCard){

        int[] cardArray = creditCard.chars()
                .map(Character::getNumericValue)
                .toArray();

        for(int i = cardArray.length - 2 ; i <= 0 ; i -= 2){
            cardArray[i] = cardArray[i]*2 > 9 ? 9 - cardArray[i]*2 : cardArray[i] ;
        }

        return Arrays.stream(cardArray).sum() % 10 == 0;
    }

}
