package org.steinko.testtutorial.business;

public class SomeBusinessImpl {
	
	SomeDataService someDataService;
	
	public void setSomeDataService(SomeDataService dataService) { 
		
		someDataService = dataService;
	}
	
	public int calculateSumUsingDataService() { 
		int sum = 0;
		int [] data = someDataService.retriveAllData();
		for(int value:data) {
			sum += value;
		}
		return sum;
	}

}
