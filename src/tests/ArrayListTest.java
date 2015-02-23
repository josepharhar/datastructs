package tests;

import static org.junit.Assert.*;
import lists.ArrayList;

import org.junit.Test;
import org.mockito.Mock;

public class ArrayListTest {
    
    @Mock
    ArrayList<Integer> mockList;

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
