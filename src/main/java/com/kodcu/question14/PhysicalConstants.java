package com.kodcu.question14;


public enum PhysicalConstants {

    PI(3.14159);
    private double value ;


    PhysicalConstants(double value) {

        this.value = value;
    }

    public double getValue() {
        return value;
    }


}