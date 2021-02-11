package edu.bu.met.cs665;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Field;

import org.junit.Test;

import edu.bu.met.cs665.beverages.Beverage;

public class BeverageTest {

	@Test //test setter
	public void testSetter_setName() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Beverage bev1 = new Beverage();
        //when
        bev1.setName("Espresso");
        
      //then
        Field s= bev1.getClass().getDeclaredField("name");
        s.setAccessible(true);
        assertEquals("Fields didn't match", s.get(bev1), "Espresso");
	}
	
	@Test //test getter
	public void testGetter_getName() throws NoSuchFieldException, IllegalAccessException {
		//given
        final Beverage bev1 = new Beverage();
        Field s= bev1.getClass().getDeclaredField("name");
        s.setAccessible(true);
        s.set(bev1, "Espresso");

        //when
        final String result = bev1.getName();
        
      //then
        assertEquals("field wasn't retrieved properly", result, "Espresso");
	}
	
	  @Test //test for correct change return	  
	  public void payBevearegeTest1() {
		  double totalBevPrice=3;		
		  InputStream in= null;
		  String money="5";
		  in=System.in;
		  System.setIn(new ByteArrayInputStream(money.getBytes()));		  
		  double changeOp= Beverage.payForBeverage(totalBevPrice);
		  assertThat((Double) changeOp,equalTo(2.0));
		 // assertEquals(0.0,output,0.0); 
		  }
}
