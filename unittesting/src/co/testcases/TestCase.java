package co.testcases;

import org.junit.Test;
import static org.junit.Assert.*;  

import co.testclasses.Calculation;

public class TestCase {
	 @Test  
	 public void testFindMax(){  
	     assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));  
	     assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));  
	 }  
}
