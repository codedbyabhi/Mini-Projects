package com.mini.carModelUpdate;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Car Model : "+c.model);
		c.changeModel("SUV");
		System.out.println("Updated Car Model : "+c.model);
	}
}
