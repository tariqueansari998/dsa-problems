package org.example.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCardValidationTest {

    CreditCardValidation cardValidation = new CreditCardValidation();

    @Test
    public void validateCreditCard(){
        Assertions.assertEquals(true, cardValidation.validateCreditCard("4556737586899855"));
        Assertions.assertEquals(false, cardValidation.validateCreditCard("5478965320147852"));
        Assertions.assertEquals(false, cardValidation.validateCreditCard("111111111111111"));
    }

}
