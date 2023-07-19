package com.example.Wanderlust.models;

import com.example.Wanderlust.utils.MathUtils;


public class PremiumMembership {
    private PremiumMembership() {}


    private static final double discountPercentage = 100;


    public static double calculateDiscountedPrice(double amount) {
        double fractionToPay = 1 - (discountPercentage / 100);
        double amountToPay = amount * fractionToPay;
        return MathUtils.roundOff(amountToPay, 2);
    }
}
