package tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import lists.ArrayList;

import org.junit.Test;

import org.mockito.Mockito.*;

import util.StringHolder;

public class ArrayListTest {
    
//    @Mock
//    StringHolder strHolder;
    
	@Test
	public void strMockTest() {
		StringHolder test = mock(StringHolder.class);

		when(test.getString()).thenReturn("this is a mock");
		
		System.out.println("test.getString(): " + test.getString());
		
//		test.when(test.getString()).thenReturn("this is a mock");
	}
	
	@Test
	public void getStringTest() {
		StringHolder test = mock(StringHolder.class);
		
		test.setString("this is a new string");
		test.getString();
		
		verify(test).setString("this is a new stringasdf");
		verify(test).getString();
	}

    @Test
    public void addGetTenIntsTest() {
        ArrayList<Integer> testList = new ArrayList<Integer>();
        
        int[] testData = {1, 2, 3, 4, 5};
        
        // Add the testData to the ArrayList
        for (int i = 0; i < testData.length; i++) {
            testList.add(testData[i]);
        }
        
        // Compare the data in each
        for (int i = 0; i < testData.length; i++) {
            int currentVal = testList.get(i);
            
            assertEquals(testData[i], currentVal);
        }
    }

}
