package com.wearegap.piggybank;

import java.util.*;

/**
 *
 * @author David Cardona
 */
public class Main {

    public static void main(String[] args) {
        
        int selection;
        PiggyBank pb = new PiggyBank();
        int coin50, coin100, coin200, coin500, coin1000;
        double total;
        
        do {
            
            System.out.println("*********PIGGY BANK SYSTEM*********\n");
            System.out.println("Please choose an option:");
            System.out.println("1. Insert Coins");
            System.out.println("2. See Totals");
            System.out.println("3. Exit");
            
            Scanner input = new Scanner(System.in);
            selection = Integer.valueOf(input.nextLine());
            
            switch(selection) {
                
                case 1:
                    System.out.println("Insert $50 coins: ");
                    coin50 = Integer.valueOf(input.nextLine());
                    System.out.println("Insert $100 coins: ");
                    coin100 = Integer.valueOf(input.nextLine());
                    System.out.println("Insert $200 coins: ");
                    coin200 = Integer.valueOf(input.nextLine());
                    System.out.println("Insert $500 coins: ");
                    coin500 = Integer.valueOf(input.nextLine());
                    System.out.println("Insert $1000 coins: ");
                    coin1000 = Integer.valueOf(input.nextLine());
                    pb.insertCoins(coin50, coin100, coin200, coin500, coin1000);
                    break;
                case 2:
                    total = pb.calculateTotals();
                    System.out.println("Total $50 coins: " + pb.getCoin50());
                    System.out.println("Total $100 coins: " + pb.getCoin100());
                    System.out.println("Total $200 coins: " + pb.getCoin200());
                    System.out.println("Total $500 coins: " + pb.getCoin500());
                    System.out.println("Total $1000 coins: " + pb.getCoin1000());
                    System.out.println("Total saved money: $" + pb.getTotal());
                    break;
                case 3:
                    System.out.println("System has been closed.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            
        } while (selection != 3);
    }
    
}
