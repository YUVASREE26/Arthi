package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoanEligibilityTest {

    @Test
    public void testEligibleCase() {
        String result = LoanEligibility.checkEligibility(25, 30000, 750);
        assertEquals("Eligible", result);
    }

    @Test
    public void testLowSalary() {
        String result = LoanEligibility.checkEligibility(25, 20000, 750);
        assertEquals("Not Eligible", result);
    }

    @Test
    public void testLowCreditScore() {
        String result = LoanEligibility.checkEligibility(25, 30000, 600);
        assertEquals("Not Eligible", result);
    }

    @Test
    public void testUnderAge() {
        String result = LoanEligibility.checkEligibility(18, 30000, 750);
        assertEquals("Not Eligible", result);
    }
}
