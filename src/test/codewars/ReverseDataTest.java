package test.codewars;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import main.codewars.ReverseData;

public class ReverseDataTest {

	@Test
	public void Test1() {
		//@formatter:off
		int[] data1= {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,1,0,1,0,1,0};
    	int[] data2= {1,0,1,0,1,0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1};
    	assertArrayEquals(data2, ReverseData.DataReverse(data1));  
  }
  
  @Test
  public void Test2() {
	  	int[] data1= {0,0,1,1,0,1,1,0,0,0,1,0,1,0,0,1};
    	int[] data2= {0,0,1,0,1,0,0,1,0,0,1,1,0,1,1,0};
    	//@formatter:on
		assertArrayEquals(data2, ReverseData.DataReverse(data1));

	}
}