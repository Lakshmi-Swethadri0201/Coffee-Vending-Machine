package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.behaviour.Brew;


public class GreenTea extends Beverage implements Brew {
	
 /**
 * Default constructor
 * 
 */
		
	 public GreenTea() {

	}	
	 
 /**
  * Constructor for GreenTea.
  * 
  * @param Name  name of the beverage GreenTea
  * @param Price Price of the beverage GreenTea
  */
	
	public GreenTea(String name){
		this.setName("GreenTea");
		this.setPrice(2.00);
	}	

	@Override
	/**
	* Making of Green Tea
	*/
	public Beverage brew (Beverage b) {
		addGreenTeaBag();
		addWater();
		System.out.println("\n Green Tea is ready");	
		return b;
	}
	
	//this method adds tea bag into the cup
	private void addGreenTeaBag() {
		System.out.println("\n Drop one Green Tea bag in the cup");
	}
		


}
