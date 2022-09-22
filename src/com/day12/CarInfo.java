package com.day12;

public class CarInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GandS_Car car= new GandS_Car();
		car.setModel(412);
		car.setPrice(2300000);
		car.setName("Audi");
		car.setSpeed("120 km/hr");
		
		System.out.println(car.getModel()+"\n"+car.getPrice()+"\n"+car.getName()+"\n"+car.getSpeed());
	}

}
