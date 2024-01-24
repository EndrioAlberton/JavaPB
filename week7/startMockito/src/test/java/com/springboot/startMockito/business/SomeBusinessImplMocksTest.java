package com.springboot.startMockito.business;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.springboot.startMockito.SomeBusinessImpl;

class SomeBusinessImplMocksTest {

	@Mock
	private DataService dataServiceMock;
	
	@InjectMocks
	private SomeBusinessImpl businessImpl;
	
    @Test
    void findTheGreatestFromAllData_basicScenario() {
   
    	DataService dataServiceMock = new mock(DataService());
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {25,15,5});
        SomeBusinessImpl businessIpml = new SomeBusinessImpl(dataServiceMock);
        int result = businessIpml.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}
