package com.shican.spi.car.impl;

import com.shican.spi.car.Car;

public class BigCar implements Car<Mather>{
	public void drive() {
		System.out.println("big car is driving");
	}
}
