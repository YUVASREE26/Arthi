package com.example;

public class LoanEligibility {

    public static String checkEligibility(int age, double salary, int creditScore) {
        if (age >= 21 && salary >= 25000 && creditScore >= 700) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkEligibility(25, 30000, 750));
    }
}

