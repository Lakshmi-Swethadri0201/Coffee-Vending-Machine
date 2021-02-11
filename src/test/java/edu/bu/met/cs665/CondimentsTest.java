package edu.bu.met.cs665;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;

import edu.bu.met.cs665.beverages.Condiments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import org.hamcrest.Description; 
import org.hamcrest.Matcher; 
import org.hamcrest.TypeSafeMatcher;
import static org.hamcrest.Matchers.*;

public class CondimentsTest {
	Condiments c = new Condiments();
	
	  @Test //test for milk units 2 
	  public void addMilkTest2() { 
		  c.setName("milk"); 
		  c.setUnitPrice(0.3); 
		  InputStream in= null;
		  String unit="2";
		  in=System.in;
		  System.setIn(new ByteArrayInputStream(unit.getBytes()));		  
		  double output= c.addMilk();
		  //assertEquals(0.6,(Double) output,0.0);
		  assertThat((Double) output,equalTo(0.6));
		 // assertEquals(0.0,output,0.0); 
		  }
	  
	  @Test //test for milk units 0
	  public void addMilkTest4() { 
		  c.setName("milk"); 
		  c.setUnitPrice(0.3); 
		  InputStream in= null;
		  String unit="0";
		  in=System.in;
		  System.setIn(new ByteArrayInputStream(unit.getBytes()));		  
		  double output= c.addMilk();
		  //assertEquals(0.6,(Double) output,0.0);
		  assertThat((Double) output,equalTo(0.0));
		 // assertEquals(0.0,output,0.0); 
		  }
	  
	  @Test //test for sugar units 1
	  public void addSugarTest2() { 
		  c.setName("sugar"); 
		  c.setUnitPrice(0.2); 
		  InputStream in= null;
		  String unit="1";
		  in=System.in;
		  System.setIn(new ByteArrayInputStream(unit.getBytes()));		  
		  double output= c.addSugar();
		  assertThat((Double) output,equalTo(0.2));
		 // assertThat((Double) output,equalTo(0.2));
		 // assertEquals(0.0,output,0.0); 
		  }
	  
	  @Test //test for sugar units 0
	  public void addSugarTest4() { 
		  c.setName("sugar"); 
		  c.setUnitPrice(0.2); 
		  InputStream in= null;
		  String unit="0";
		  in=System.in;
		  System.setIn(new ByteArrayInputStream(unit.getBytes()));		  
		  double output= c.addSugar();
		 assertThat((Double) output,equalTo(0.0));
		 // assertEquals(0.0,output,0.0); 
		  }
	  
	  @Test //test if total units are calculated
 	  public void totalCondUnitsTest() {		
		int totunits= Condiments.totalCondUnits(2,3);
		assertEquals(5, totunits);		  
		  
	  }

	  @Test //test if total units are mismatched
 	  public void totalCondUnitsTest2() {		
		int totunits= Condiments.totalCondUnits(2,3);
		assertNotEquals(7, totunits);		  
		  
	  }
}
