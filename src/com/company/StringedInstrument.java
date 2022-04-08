package com.company;

public class StringedInstrument extends Instrument {
    private int noOfStrings;


    public StringedInstrument(String name, int cost, int noOfStrings) {
        super(name, cost);
        this.noOfStrings = noOfStrings;
    }

    @Override
    public void describeInstrument() {
        System.out.println("Instrument: " + getName() + ". Cost: " + getCost() +
                ", Number of Strings:" + noOfStrings + ".");

    }
}