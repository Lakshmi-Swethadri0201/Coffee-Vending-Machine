package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import edu.bu.met.cs665.beverages.Americano;
import edu.bu.met.cs665.beverages.Beverage;
import edu.bu.met.cs665.beverages.BlackTea;
import edu.bu.met.cs665.beverages.Espresso;

public class BrewTest {		
	
	
	@Test	//testing brew espresso functionality
	public void testBrewEspresso(){		
		Espresso es= new Espresso();
		Beverage bev = new Espresso("Espresso"); 
		Beverage output = es.brew(bev);
		System.out.println(bev);
		System.out.println(output);
		assertEquals(bev,output);		
	}	
	
	@Test	//testing brew americano functionality
	public void testBrewAmericano(){	
		Americano a= new Americano();
		Beverage bev = new Americano("Americano"); 
		Beverage output = a.brew(bev);
		System.out.println(bev);
		System.out.println(output);
		assertEquals(bev,output);		
	}	
	
	@Test	//testing brew black tea functionality
	public void testBrewBlackTea(){	
		BlackTea bt= new BlackTea();
		Beverage bev = new BlackTea("BlackTea"); 
		Beverage output = bt.brew(bev);
		System.out.println(bev);
		System.out.println(output);
		assertEquals(bev,output);		
	}	

}
