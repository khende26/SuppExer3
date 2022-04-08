package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    List<Instrument> listOfInstruments = new ArrayList<Instrument>();
    listOfInstruments.add(new Instrument("Xylaphone", 75));
    listOfInstruments.add(new Instrument("Piano", 1150));
    listOfInstruments.add(new Instrument("Tuba", 625));
    listOfInstruments.add(new Instrument("Trumpet", 750));
    List<StringedInstrument> listOfStringInstruments = new ArrayList<>();
    listOfStringInstruments.add(new StringedInstrument("Guitar", 350, 5));
    listOfStringInstruments.add(new StringedInstrument("Banjo", 200, 6));
    listOfStringInstruments.add(new StringedInstrument("Violin", 1300, 4));
    listOfStringInstruments.add(new StringedInstrument("Cello", 900, 4));
    List<Instrument> allInstruments = new ArrayList<>();
    allInstruments.addAll(listOfInstruments);
    allInstruments.addAll(listOfStringInstruments);
    List<WindInstruments> listOfWindInstruments = new ArrayList<>();
    listOfWindInstruments.add(new WindInstruments("flute", 150, false));
    listOfWindInstruments.add(new WindInstruments("Clarinet", 200, true));
    listOfWindInstruments.add(new WindInstruments("Oboe", 300, true));
    allInstruments.addAll(listOfWindInstruments);
    MusicalInstrumentShop  inventoryList = new MusicalInstrumentShop(allInstruments);






     for(Instrument list1 : listOfInstruments) {
         list1.describeInstrument();

     }
     int sum = 0;

     for(int i = 0; i < listOfInstruments.size(); i++ ) {
           listOfInstruments.get(i).getCost();       // pull the cost of each instrument as it goes thru list
          sum += listOfInstruments.get(i).getCost();   // save the cost of each instr as it iterates thru the list
         System.out.println(sum); // print the sum

        }
     for (StringedInstrument  list2 : listOfStringInstruments) {
         list2.describeInstrument();

     }
     for (int i = 0; i< allInstruments.size(); i++) {
         allInstruments.get(i).describeInstrument();

     }   String allNames= "";
        for(int i = 0; i < allInstruments.size(); i++) {
            allNames += allInstruments.get(i).getName() + ", ";
        }
        System.out.println(allNames);

           int count = 0;
        for(int i = 0;  i < listOfWindInstruments.size(); i++) {
        if (listOfWindInstruments.get(i).isHasReed() == (true)) {
            count ++;

        }
        }      System.out.println(count + " out of 3 wind instruments have reeds.");

        inventoryList.listInventory();

        System.out.println(inventoryList.canAffordInstrument(3, 500));
        System.out.println(inventoryList.canAffordAnInstrument(500));
    }
}
