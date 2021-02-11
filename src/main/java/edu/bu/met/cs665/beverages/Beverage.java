package edu.bu.met.cs665.beverages;

import java.util.Scanner;

import edu.bu.met.cs665.behaviour.Brew;



public class Beverage implements Brew {
	private String name;
	private double price;
	
	//default constructor
	public Beverage() {
		
	}
	
	//single arg constructor
	public Beverage(String name) {
		this.name = name;
	}
	
	//multiple arg constructor
	public Beverage(String name, double price) {
		this.name = name;
		this.price = price;
	}

	/**
	  * Getter for Name.
	  * 
	  * @return
	  */

	public String getName() {
		return name;
	}

	/**
	 * Setter for Name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for Price.
	 * 
	 * @return
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Setter for Price
	 * 
	  * @param price
	  */
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Beverage [name=" + name + ", price=" + price + "]";
	}

	/**
	 * prepare beverage method executes brew interface as per the beverage object.
	 * calls add milk and add sugar method to calculate milk and sugar price.
	 * calculates the total beverage price.
	 * 
	 * @return totalBevPrice is the Total beverage Price which user has to pay
	 */
	public double prepareBeverage(Beverage bev) {			
		bev.brew(bev);	
		Condiments c = new Condiments("Milk", 0.3);		
		double milkPrice = c.addMilk();
		//System.out.println("Extra milk cost " + milkPrice + "$");
		Condiments c1 = new Condiments("Sugar", 0.2);
		double sugarPrice = c1.addSugar();
		//System.out.println("Extra sugar cost " + sugarPrice + "$");
		double totalBevPrice = this.price + milkPrice + sugarPrice;		
		System.out.println("\n Your total drink cost is " + totalBevPrice + "$");		
		Beverage.payForBeverage(totalBevPrice);
		return totalBevPrice;		
		
	}

	/**
	 * @param totalBevPrice is the total beverage price 
	 * asks user to pay the total beverage price
	 * 
	 * @return change which is the difference amount of money entered and total drink price
	 */
	public static double payForBeverage(double totalBevPrice) {
		double change;		
		try (Scanner userInput = new Scanner(System.in)) {
			while (true) {
				System.out.println("\n Please enter money to pay");
				String money = null;
				money=userInput.nextLine();
				double moneyEntered = Double.parseDouble(money);
				if (moneyEntered >= totalBevPrice) {		
					change = moneyEntered- totalBevPrice;
					System.out.println("\n Your change is $" + String.format("%.2f", change));
					System.out.println("\n ****** Thank You, Please enjoy your drink ******");					
					break;					
				} else {
					System.out
					.println("\n Insufficient money entered:  please Try again!");
					continue;
				}
			}
		}
		return change;		
	
	}

	

	
	
	//adds water
	public void addWater() {
		System.out.println("\n Add hot water to the cup");
	}		
	
	//adds foam milk
	public void addFoamMilk() {
		System.out.println("\n Add foam milk to the cup");
	}

	@Override
	public Beverage brew(Beverage b) {
		// TODO Auto-generated method stub
		return null;
	}






}
