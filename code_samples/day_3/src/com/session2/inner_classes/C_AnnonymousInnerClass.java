package com.session2.inner_classes;

// something is not named or identified, or made or done by someone unknown
interface Cookable {
	void cook();
}

public class C_AnnonymousInnerClass {

	public static void main(String[] args) {

		Cookable c = new Cookable() {

			@Override
			public void cook() {
				System.out.println("street food");
			}
		};

		Cookable c2 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
		
		Cookable c3 = new Cookable() {

			@Override
			public void cook() {
				System.out.println("hotel food");
			}
		};
		c.cook();
		c2.cook();
		c3.cook();
	}

}
