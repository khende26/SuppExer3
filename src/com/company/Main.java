package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        MusicalInstrumentShop inventoryList = new MusicalInstrumentShop(allInstruments);


        for (Instrument list1 : listOfInstruments) {
            list1.describeInstrument();

        }
        int sum = 0;

        for (int i = 0; i < listOfInstruments.size(); i++) {
            listOfInstruments.get(i).getCost();       // pull the cost of each instrument as it goes thru list
            sum += listOfInstruments.get(i).getCost();   // save the cost of each instr as it iterates thru the list
            System.out.println(sum); // print the sum

        }
        for (StringedInstrument list2 : listOfStringInstruments) {
            list2.describeInstrument();

        }
        for (int i = 0; i < allInstruments.size(); i++) {
            allInstruments.get(i).describeInstrument();

        }
        String allNames = "";
        for (int i = 0; i < allInstruments.size(); i++) {
            allNames += allInstruments.get(i).getName() + ", ";
        }
        System.out.println(allNames);

        int count = 0;
        for (int i = 0; i < listOfWindInstruments.size(); i++) {
            if (listOfWindInstruments.get(i).isHasReed() == (true)) {
                count++;

            }
        }
        System.out.println(count + " out of 3 wind instruments have reeds.");

        inventoryList.listInventory();

        //  System.out.println(inventoryList.canAffordInstrument(3, 500));
        //  System.out.println(inventoryList.canAffordAnInstrument(500));
        //  System.out.println(inventoryList.hasInstruments());
        //  Customer cust = new Customer("Karri", 1000);
        //  cust.purchaseInstrument(allInstruments.get(0));
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Welcome to the must shop would you like to see " +
                "a list of instruments.  \n Press 1 for Yes \n Press 2 to leave the store");
        int userInput = myScanner.nextInt();
        myScanner.nextLine();
        if (userInput == 1) {
            inventoryList.listInventory();
            System.out.println("\n Do you wish to purchase an instrument? \n Press 1 for Yes, " +
                    "\n Press 2 to purchase more than one instrument \n Press 3 to leave the shop");
            userInput = myScanner.nextInt();
            if (userInput == 1) {
                System.out.println("Please enter your name");
                String username = myScanner.nextLine();
                System.out.println("Please enter the amount of money you have to spend");
                myScanner.nextLine();
                int custMoney = myScanner.nextInt();
                Customer cust1 = new Customer(username, custMoney);
                inventoryList.listInventory();
                System.out.println("Choose the # of the item you would like to purchase");
                int invNo = myScanner.nextInt();
                System.out.println("Is this instrument available? " + inventoryList.hasInstruments());
                cust1.purchaseInstrument(inventoryList.sellInstrument(invNo));
                inventoryList.sellInstrument(invNo);
            }
            if (userInput == 2) {
                System.out.println("Please enter your name");
                String username = myScanner.nextLine();
                System.out.println("Please enter the amount of money you have to spend");
                myScanner.nextLine();
                int custMoney = myScanner.nextInt();
                Customer cust1 = new Customer(username, custMoney);

                inventoryList.listInventory();
                while (cust1.getAmtOfMoney() > 0 || inventoryList.hasInstruments()) {
                    System.out.println("Choose the # of the item you would like to purchase");
                    int invNo = myScanner.nextInt();
                    myScanner.nextLine();
                    System.out.println("Is this instrument available? " + inventoryList.hasInstruments());
                    if (inventoryList.canAffordInstrument(invNo, cust1.getAmtOfMoney()) == false) {
                        System.out.println("You can not afford this instrument.  Amount of money showing " + cust1.getAmtOfMoney());
                        break;

                    } else {
                        Instrument soldInstrument = inventoryList.sellInstrument(invNo);
                        cust1.purchaseInstrument(soldInstrument);
                        inventoryList.listInventory();
                        if (inventoryList.hasInstruments() == false) {
                            System.out.println("The shop is out of instruments, thank you for your purchase");
                            break;
                        }

                    }
                }
            }
        }
    }
}

