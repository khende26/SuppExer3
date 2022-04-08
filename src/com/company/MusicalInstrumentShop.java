package com.company;

import javax.naming.Name;
import java.util.List;

public class MusicalInstrumentShop {
    private List<Instrument> inventory;

    public MusicalInstrumentShop(List<Instrument> inventory) {
        this.inventory = inventory;
    }

    public List<Instrument> getInventory(List<Instrument> inventory) {
        return inventory;
    }

    public void setInventory(List<Instrument> inventory) {
        this.inventory = inventory;
    }

    public void listInventory() {

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println("Instrument #: " + (i + 1));
            inventory.get(i).describeInstrument();

        }

    }

    public boolean canAffordInstrument(int invNo, int custMoney) {
        boolean canAfford = false;
        //need to get an inventory number
        if (inventory.get(invNo).getCost() <= custMoney) {
            canAfford = true;
            System.out.println(inventory.get(invNo).getName());
        }
        //need to compare amount of money
        return canAfford;
    }

    public boolean canAffordAnInstrument(int custMoney) {
        boolean canAffordAn = false;
        for (int i = 0; i < inventory.size(); i++) {       // need to go through each instrument and compare cost to custMoney
            if (inventory.get(i).getCost() <= custMoney) {    // if cost less than c money
                canAffordAn = true;          //set boolean canAffordAn to true
                System.out.println("you have enough money to buy " +inventory.get(i).getName() + " , " + inventory.get(i).getCost());
            }
        }
        return canAffordAn;
    }
}