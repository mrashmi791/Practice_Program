package com.practice.mindfire;

 class Test {
	 static int noOfObjects = 0; 
	  
	    // Instead of performing increment in the constructor 
	    // instance block is preferred to make this program generic. 
	    { 
	        noOfObjects += 1; 
	    } 
	public void  show() {
		System.out.println("hello....");
	}
	
}	public class ReferenceVariable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t  ;
		t= new Test();
		Test t1 = new Test();
		Test t2 = new Test();
//		Test t5 = null;
//		t5 = new Test();
		Test t3 = t2;
		t3 = t1;
		 System.out.println(Test.noOfObjects); 
	}
	

}
