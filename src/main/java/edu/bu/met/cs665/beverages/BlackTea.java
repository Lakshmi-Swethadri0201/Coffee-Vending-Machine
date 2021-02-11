package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.behaviour.Brew;

public class BlackTea extends Beverage implements Brew {
	
	/**
	 * Default constructor
	 * 
	 */
		
	 public BlackTea() {

		}	
	 
	/**
	   * Constructor for BlackTea.
	   * 
	   * @param Name  name of the beverage BlackTea
	   * @param Price Price of the beverage BlackTea
	   */
	
	public BlackTea(String name){
		this.setName("BlackTea");
		this.setPrice(2.00);
	}
	
	@Override
	/**
	* Making of Black Tea
	*/
	public Beverage brew (Beverage b) {
		addRegularTeaBag();
		addWater();
		System.out.println("\n Black Tea is ready");
		return b;
	}
	
	//this method adds tea bag into the cup
	private void addRegularTeaBag() {
		System.out.println("\n Drop one Black Tea bag in the cup");
	}
	


}
