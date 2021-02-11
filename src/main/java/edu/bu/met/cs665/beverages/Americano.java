package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.behaviour.Brew;


public class Americano extends Beverage implements Brew {
	Espresso es= new Espresso();
	
	/**
	 * Default constructor
	 * 
	 */
		
	 public Americano() {

		}	
	
			
  /**
	* Constructor for Americano.
	* 
	* @param Name  name of the beverage Americano
	* @param Price Price of the beverage Americano
	*/
	

   public Americano(String name){
		this.setName("Americano");
		this.setPrice(3.00);
	}
	
	/**
	 * implementing brew functionality for Americano
	 * 
	 */
	@Override
	public Beverage brew (Beverage b) {
		es.brewEspressoBasicShot();
		addWater();
		System.out.println("\n Dispense Americano ");	
		return b;
	}
	

}
