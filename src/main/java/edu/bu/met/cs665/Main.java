package edu.bu.met.cs665;
/**
  * @author Lakshmi Swethadri
 */
public class Main {
	 /**
	  * This main method launches the application.
	  * Here we call functions for load beverages and show display menu.
	  *  		   
	  * @param args not used
	  */
	 public static void main(String[] args) {	
	
		// Let us create an object of the VendingMachineControllerUI class.
        VendingMachineControllerUI vmc = new VendingMachineControllerUI();    
        //calls beverages method to load beverages to the list.
		vmc.beverages();
		 //calls display menu method to show menu list.
		vmc.displayMenu();
	}	
	
}
