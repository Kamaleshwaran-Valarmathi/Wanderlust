package com.example.Wanderlust.utils;

public class MathUtils {
    public static double roundOff(double value, int decimalPlaces) {
        return Math.round(value * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }
}
