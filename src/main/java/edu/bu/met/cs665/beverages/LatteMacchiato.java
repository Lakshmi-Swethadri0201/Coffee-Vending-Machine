package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.behaviour.Brew;

public class LatteMacchiato extends Beverage implements Brew {
	
	//creating an instance of espresso
	Espresso es=new Espresso();
	
	 /**
	 * Default constructor
	 * 
	 */
			
		 public LatteMacchiato() {

		}	
	
  /**
	* Constructor for LatteMacchiato.
	* 
	* @param Name  name of the beverage LatteMacchiato
	* @param Price Price of the beverage LatteMacchiato
	*/
	public LatteMacchiato(String name){
		this.setName("Latte Macchiato");
		this.setPrice(4.00);
	}
	
	/**
	 * implementing brew functionality for LatteMacchiato
	 * 
	 */
	@Override
	public Beverage brew(Beverage b) {		
		//make base espresso sbasic shot 
		es.brewEspressoBasicShot();
		//add foam milk to the base drink
		addFoamMilk();	
		System.out.println("Dispense Latte Macchiato ");	
		return b;
	}
	


}
