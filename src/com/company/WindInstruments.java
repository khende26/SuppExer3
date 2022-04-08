package com.company;

public class WindInstruments extends Instrument{
    private boolean hasReed;

    public WindInstruments(String name, int cost, boolean hasReed) {
        super(name, cost);
        this.hasReed = hasReed;
    }

    public boolean isHasReed() {
        return hasReed;
    }

    @Override
    public void describeInstrument() {
        System.out.println("Instrument: " + getName() + ". Cost: " + getCost() +
                ".  Does this instrument have a reed: " +  hasReed+ ".");
    }
}
