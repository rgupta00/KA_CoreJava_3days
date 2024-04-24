package com.session2.inner_classes;

// something is not named or identified, or made or done by someone unknown


public class D_LambdaEx {

	public static void main(String[] args) {

		Cookable c = ()-> System.out.println("street food");
			
		

		Cookable c2 =() ->System.out.println("hotel food");
			
	
		
		Cookable c3 = ()-> System.out.println("hotel food");
		
		c.cook();
		c2.cook();
		c3.cook();
	}

}
