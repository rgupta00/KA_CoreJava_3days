package com.session2.ob_class;

import java.util.Objects;

class Emp extends Object{
	
	private int id;
	private String name;

	public Emp(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//used to print state of the object
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	//finilized  method 
	//final vs finally vs finilized
	//KB		kb			method

	//?
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
	}
	
	
	
}
public class A_DemoObjectClass {
	
	public static void main(String[] args) {
//		Emp e=new Emp(1, "john");
//		System.out.println(e);
		
		Emp e1=new Emp(1, "john");
		Emp e2=new Emp(1, "john");
		
//		//compare the address of the object 
//		if(e1==e2) {
//			System.out.println("both are same");
//		}else
//			System.out.println("not same");
		
		//compare the content of the object 
		if(e1.equals(e2)) {
			System.out.println("both are same");
		}else
			System.out.println("not same");
		
	}

}
