package com.company;

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
        if (inventory.get(invNo-1).getCost() <= custMoney) {
            canAfford = true;
            System.out.println(inventory.get(invNo-1).getName());
        }
        //need to compare amount of money
        return canAfford;
    }

    public boolean canAffordAnInstrument(int invNo, int custMoney) {
        boolean canAffordAn = false;
        Instrument instrument = inventory.get(invNo -1);
          if (instrument.getCost() <= custMoney) {    // if cost less than c money
                canAffordAn = true;          //set boolean canAffordAn to true
                System.out.println("you have enough money to buy " + instrument.getName() + " , " +
                        instrument.getCost());
            }

        return canAffordAn;
    }
    public Instrument sellInstrument(int invNumber) {
            Instrument newInstr = inventory.get(invNumber -1);      //get the inventory item
            inventory.remove(invNumber-1); //only removing index need to remove object? //remove item from inventory once a match is found

         return newInstr;
    }
    public boolean hasInstruments() {

             if (inventory.isEmpty()) {                      // determine if any item is available
             return  false;
             }
          return true;
    }

}