package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.behaviour.Brew;

public class YellowTea extends Beverage implements Brew {
	
	/**
	 * Default constructor
	 * 
	 */
		
	 public YellowTea() {

	}	
	 
  /**
	* Constructor for LatteMacchiato.
	* 
	* @param Name  name of the beverage LatteMacchiato
	* @param Price Price of the beverage LatteMacchiato
	*/
	public YellowTea(String name){
		this.setName("YellowTea");
		this.setPrice(1.5);
	}	
	
	  
	@Override
	/**
	* Making of YellowTea
	*/
	public Beverage brew (Beverage b) {
		addYellowTeaBag();
		addWater();
		System.out.println("\n Yellow Tea is ready");	
		return b;
	}
	
	//this method adds tea bag into the cup
	private void addYellowTeaBag() {
		System.out.println("\n Drop one Yellow Tea bag in the cup");
	}
	


}
