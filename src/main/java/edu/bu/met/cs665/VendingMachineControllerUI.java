package edu.bu.met.cs665;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import edu.bu.met.cs665.beverages.Americano;
import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.beverages.BlackTea;
import edu.bu.met.cs665.beverages.Condiments;
import edu.bu.met.cs665.beverages.Espresso;
import edu.bu.met.cs665.beverages.GreenTea;
import edu.bu.met.cs665.beverages.LatteMacchiato;
import edu.bu.met.cs665.beverages.YellowTea;

public class VendingMachineControllerUI {
	/*
	 * Loads all beverages					
	 */
	List<Beverage> beverages= new ArrayList<>();
	/**
	 * Method for adding beverages to the list.
	 *
	 * @param not used
	 */
	public void beverages() {
		beverages.add(new Beverage("Espresso",2.00));
		beverages.add(new Beverage("Americano",3.00));
		beverages.add(new Beverage("Latte Macchiato",4.00));
		beverages.add(new Beverage("Green Tea",2.00));
		beverages.add(new Beverage("Black Tea",2.00));
		beverages.add(new Beverage("Yellow Tea",1.50));	
	}	
	
	/**
	 * Method for showing menu items to the user.
	 *
	 * @param not used
	 */
	public void displayMenu() {		
		System.out.println("Welcome to BU Beverage Vending Machine. ");	
		System.out.println(" \nPlease select the beverage of your choice.\n ");	
		System.out.println("  Coffee-Hot");
		System.out.println("	(1) Espresso" + " 2.00$");
		System.out.println("	(2) Americano" + " 3.00$");
		System.out.println("	(3) Latte Macchiato" + " 4.00$");
		System.out.println("  Tea-Hot");
		System.out.println("	(4) Black Tea" + " 2.00$");
		System.out.println("	(5) Green Tea" + " 2.00$");
		System.out.println("	(6) Yellow Tea" + " 1.5$");
		
		System.out.println(" \nAll hot drinks can be added condiments of your choice ");
		System.out.println(" Extra milk/unit - 0.3$ ");
		System.out.println(" Extra sugar/unit- 0.2$ ");			
				
	/**
	 * Taking input from the user for beverage choice.
	 *
	 * */	
							
		try (Scanner userInput = new Scanner(System.in)) {
			int beverageChoice = 0;
			beverageChoice= userInput.nextInt();			
					
			switch(beverageChoice) {
			case 0:	System.out.println("Thank You, Please visit again");
			break;			
						case 1: System.out.println("Please wait while " + beverages.get(beverageChoice-1).getName() + " is getting ready");
								Beverage bev1 = new Espresso("Espresso"); 
								bev1.prepareBeverage(bev1);	
								break;
						case 2:	System.out.println("Please wait while " + beverages.get(beverageChoice-1).getName() + " is getting ready");
								Beverage bev2 = new Americano("Americano"); 
								bev2.prepareBeverage(bev2);	
								break;
						case 3:	System.out.println("Please wait while " + beverages.get(beverageChoice-1).getName() + " is getting ready");
								Beverage bev3 = new LatteMacchiato("LatteMachhiato"); 
								bev3.prepareBeverage(bev3);	
								break;												
						case 4:	System.out.println("Please wait while " + beverages.get(beverageChoice-1).getName() + " is getting ready");
								Beverage bev4 = new BlackTea("BlackTea"); 
								bev4.prepareBeverage(bev4);
								break;
						case 5:	System.out.println("Please wait while " + beverages.get(beverageChoice-1).getName() + " is getting ready");
								Beverage bev5 = new GreenTea("GreenTea"); 
								bev5.prepareBeverage(bev5);
								break;					
						case 6:	System.out.println("Please wait while " + beverages.get(beverageChoice-1).getName() + " is getting ready");
								Beverage bev6 = new YellowTea("YellowTea"); 
								bev6.prepareBeverage(bev6);
								break;	
						default:System.out.println("Sorry, No option found");
								System.out.println("\nPlease select any number from 1-6 to continue your order or 0 to exit \n");
							    displayMenu();
								break;							
						}	
		}
		catch (RuntimeException e) {
		    throw e;
		    }			
				catch (Exception e) {
				      System.out.println("Please go back to Start Menu,"
				      		+ " and select any number from 1-6 to continue your order "
				      		+ "or 0 to exit");				   
				      }
				
				
	}
			
		
}	
