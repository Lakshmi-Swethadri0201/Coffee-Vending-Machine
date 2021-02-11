package edu.bu.met.cs665.beverages;

import java.util.Scanner;
/**
 * Class responsible for determining what are all the condiments.
 * And what condiments the user wants to include in their drink, such
 * as Milk or Sugar.
 */

public class Condiments {
	
	private String name;	
	private double unitPrice;
	private double milkPrice;
	private double sugarPrice;
	protected static String munits;
	protected static String sunits;	
	
	//default constructor
	public Condiments() {
		
	}
	//single param constructor
	public Condiments(String name) {
		this.name = name;	
	}
	
	//multiple param constructor
	public Condiments(String name, double unitPrice) {
		super();
		this.name = name;		
		this.unitPrice = unitPrice;
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
	  * Setter for Name.
	  * 
	  */
	public void setName(String name) {
		this.name = name;
	}
	/**
	  * Getter for unitPrice.
	  * 
	  * @return 
	  */
	public double getUnitPrice() {
		return unitPrice;
	}
	/**
	  * Setter for unitPrice.
	  * 
	  */

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public String toString() {
		return "Condiments [name=" + name + ",  unitPrice=" + unitPrice + "]";
	}		
	
	  /**
	   * Asks the user how much of milk condiment units they would like.
	   *
	   * @param not used.
	   * @return milkPrice which is calculated based on the units and unit price
	   */
	
	public double addMilk(){
		//accept user input for milk units
		Scanner userInput = new Scanner(System.in);
		System.out.println(" \n Do you wish to add milk for your drink? \n ");
		System.out.println(" (0) for No Milk");
		System.out.println(" (1) for 1 Milk Unit");
		System.out.println(" (2) for 2 Milk Units");
		System.out.println(" (3) for 3 Milk Units");	
		munits=null;		
		munits= userInput.nextLine();
		int munit=Integer.parseInt(munits);
		System.out.println(munits);
		if(munit==0) {
			System.out.println("No milk is added to your drink");				
		} else if (munit >0 && munit<4) {			
				this.milkPrice= this.getUnitPrice() * munit;
				System.out.println(munit + " milk unit is added to your drink and " + "MilkPrice is " +   milkPrice + "$");
			}
		else {
			System.out.println("option not found, please select 0-3 milk units" );
			//call add milk method again if invalid input is entered
			addMilk();
		}					
		return milkPrice;
		
		}
	
	
	 /**
	   * Asks the user how much of sugar condiment units they would like.
	   *
	   * @param not used.
	   * @return sugarPrice which is calculated based on the units and unit price
	   */
	public double addSugar(){
		//accept user input for sugar units
		Scanner userInput = new Scanner(System.in);
		System.out.println(" \n Do you wish to add sugar for your drink?");
		System.out.println(" Press 0 for No Sugar");
		System.out.println(" Press 1 for 1 Sugar Units");
		System.out.println(" Press 2 for 2 Sugar Units");
		System.out.println(" Press 3 for 3 Sugar Units");	
		sunits=null;
		sunits=userInput.nextLine();	
		int sunit=Integer.parseInt(sunits);
			if(sunit==0) {
				System.out.println("No sugar is added to your drink");				
			} else if (sunit >0 && sunit<4) {			
					this.sugarPrice= this.getUnitPrice() * sunit;					
					System.out.println(sunit + " sugar unit is added to your drink and your " + "SugarPrice is " +  sugarPrice + "$");
				}
			else {
				System.out.println("option not found, please select 0-3 sugar units" );
				//call add sugar method again if invalid input is entered
				addSugar();
			}	
			return sugarPrice;	
		
			}
	
	 /**
	   * calculates the total condiment units
	   *
	   * @param munits containing milk units
	   * @param sunits containing sugar units
	   * @return totalunits containing total number of units selected by the user.
	   * 
	   * adding this only to check junit validation
	   */

	public static int totalCondUnits(int munits, int sunits) {
		int totalUnits= munits+sunits;
		System.out.println(totalUnits);
		if(totalUnits<=6) {
			System.out.println("total units selected are with in the limit");
		} else {
			System.out.println("total units are out of range"); 
		}
		return totalUnits;
	}
	
	
}
	
	

	

	
	

