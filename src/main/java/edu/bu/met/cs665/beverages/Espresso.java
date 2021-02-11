package edu.bu.met.cs665.beverages;

import edu.bu.met.cs665.behaviour.Brew;

public class Espresso extends Beverage implements Brew {

	// initial state of the valve (closed)
	 private Boolean espressoValve = false; 

	/**
	 * Default constructor
	 * 
	 */
		
	 public Espresso() {

		}	 
	/**
	 * Constructor for Espresso.
	 * @param Name  name of the beverage Espresso
	 * @param Price Price of the beverage Espresso
	 * 
	 */
	public Espresso(String name) {
		this.setName("Espresso");
		this.setPrice(2.00);
	}	
	
	/**
	 * implementing brew functionality for Espresso
	 *  
	 */
	@Override
	public Beverage brew(Beverage b){
		brewEspressoBasicShot();
		System.out.println("\n Dispense" +  b.getName());
		return b;				
	}	

   public void brewEspressoBasicShot() { 
	   espressoValve = true; 
		  System.out.println("\n valve is open");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("\n valve is closed"); 	  
	  espressoValve = false;
	  
	  
	  }
	 

}
