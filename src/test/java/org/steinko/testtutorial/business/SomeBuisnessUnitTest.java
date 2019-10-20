package org.steinko.testtutorial.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import org.mockito.Mock;
import org.mockito.InjectMocks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBuisnessUnitTest {
	@InjectMocks
	private SomeBusinessImpl business = new SomeBusinessImpl();
	
	@Mock
	private SomeDataService dataServiceMock;
	
	

	@Test
	public void calculateSumUsingDataService_basic() {
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {1,2,3});	
		assertEquals(6,business.calculateSumUsingDataService());
		
	}
	
	@Test
	public void calculateSumUsingDataService_alternativ1() {	
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {2,2,3});
		assertEquals(7,business.calculateSumUsingDataService());
		
	}
	
	@Test
	public void calculateSumUsingDataService_noElements() {		
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {});
		assertEquals(0,business.calculateSumUsingDataService());
	}	

}
