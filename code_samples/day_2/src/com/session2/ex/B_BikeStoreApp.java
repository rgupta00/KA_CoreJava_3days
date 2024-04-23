package com.session2.ex;

class BikeStoreCreationExcption extends Exception{

	public BikeStoreCreationExcption(String message) {
		super(message);
	}
}
//BikeNotAvailableException
class BikeNotAvailableException extends Exception{

	public BikeNotAvailableException(String message) {
		super(message);
	}
}

//StoreFullExcpetion
class StoreFullExcpetion extends Exception{

	public StoreFullExcpetion(String message) {
		super(message);
	}
}

class BikeStore{
	private int noOfBike;
	private String bikeBrand;
	
	public BikeStore(int noOfBike, String bikeBrand) throws BikeStoreCreationExcption{
		if(noOfBike<10)
			throw new BikeStoreCreationExcption("min no of bikes should be 10");
		this.noOfBike = noOfBike;
		this.bikeBrand = bikeBrand;
	}
	
	public void sell(int requstedBike)throws BikeNotAvailableException {
		int temp=noOfBike-requstedBike;//20-8
		if(temp<10) {
			throw new BikeNotAvailableException("we can not sell as we should hv min inventory of 10 bike any time");
		}
		noOfBike=temp;
		
	}
	
	public void procurement(int addBikes)throws StoreFullExcpetion {
		int temp=noOfBike+addBikes;//20-8
		if(temp>20) {
			throw new StoreFullExcpetion("we can not store more then 20 bikes in our store");
		}
		noOfBike=temp;
		
	}
	public void print() {
		System.out.println("no of bikes: "+ noOfBike);
		System.out.println("Brand of bikes: "+ bikeBrand);
	}
	
}
public class B_BikeStoreApp {
	
	public static void main(String[] args) {
		try {
			BikeStore bikeStore=new BikeStore(10, "java bike");
			
			bikeStore.procurement(1);
			bikeStore.sell(1);
			bikeStore.print();
		} catch (BikeStoreCreationExcption e) {
			System.out.println(e.getMessage());
		} 
		catch (BikeNotAvailableException e) {
			System.out.println(e.getMessage());

		} catch (StoreFullExcpetion e) {
			System.out.println(e.getMessage());
		}
	}

}




