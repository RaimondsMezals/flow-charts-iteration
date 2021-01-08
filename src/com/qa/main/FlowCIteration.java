package com.qa.main;

public class FlowCIteration {
	
	public void countingChart1() {
		
		for(int a = 100; a < 200; a++) {
			
			System.out.println(a);
			
		}
		
	}
	
	public void countingcHART2() {
		
		for(int a = 100; a <= 200; a++) {
			
				if(a % 2 ==0) {
					
					System.out.println("-");
					
				}else {
					
					System.out.println("*");
					
				}
			
		}
		
	}
	
	
	//Create a method that can print out the numbers 1-10 10 times each.
	public void printingNumbersRepeated(){
		
		for(int i = 1; i <= 10; i++) {
			
			for(int b = 1; b <= 10; b++) {
				
				System.out.println(i);
				
			}
			
		}
		
	}
	
	public void printingAsManyAsValue(){
		
		for(int i = 1; i <= 10; i++) {
			
			for(int b = i; b >= 1; b--) {
				
				System.out.println(i);
				
			}
			
		}
		
	}
	
	
	

}
