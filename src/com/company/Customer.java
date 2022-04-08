package com.company;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final String name;
    private int amtOfMoney;
    private List<Instrument> instrumentPurchased = new ArrayList<>();


    public Customer(String name, int amtOfMoney) {
        this.name = name;
        this.amtOfMoney = amtOfMoney;

    }

    public String getName() {
        return name;
    }

    public int getAmtOfMoney() {
        return amtOfMoney;
    }

    public void setAmtOfMoney(int amtOfMoney) {
        this.amtOfMoney = amtOfMoney;
    }

    public List<Instrument> getInstrumentPurchased() {
        return instrumentPurchased;
    }

    public void addInstrumentPurchased(Instrument purchasedInstrument) {
        instrumentPurchased.add(purchasedInstrument);
    }

    public String enumeratePurchasedInstrumentNames() {
        String newePin= "";                           //initialize newePin
        for(Instrument ePin : instrumentPurchased) { //loop through each instrument
            newePin = newePin + ePin.getName();      //get name for each instrument and add tp mewePin
        }

        return newePin;
    }
    public void purchaseInstrument(Instrument newInstrument) {
        //add instrument to list of instrumentPurchased in class
        //deduct the cost of the instrument from the customer amount of money
    }

}





