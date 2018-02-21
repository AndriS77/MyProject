package Headphone;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private String mark;
	private String model;
	private String numberPlate;
	private String regNumber;
	private List<String> carOwner;
	
	public Car(String mark, String model, String numberPlate, String regNumber) {
		super();
		this.mark = mark;
		this.model = model;
		this.numberPlate = numberPlate;
		this.regNumber = regNumber;
		this.carOwner =new ArrayList<>();
	}

	@Override
	public String toString() {
		return "Cars [mark=" + mark + ", model=" + model + ", numberPlate=" + numberPlate + ", regNumber=" + regNumber
				+ ", carOwner=" + carOwner + "]";
	}
	
	public void addOwner(String newOwner) {
		carOwner.add(newOwner);
	}
	

	}
