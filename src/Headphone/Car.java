package Headphone;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Car {

	private String mark;
	private String model;
	private String numberPlate;
	private Calendar regDate;
	private List<String> carOwner;

	public Car(String mark, String model, String numberPlate, Calendar regDate) {
		super();
		this.mark = mark;
		this.model = model;
		this.numberPlate = numberPlate;
		this.regDate = regDate;
		this.carOwner = new ArrayList<>();
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("d. MMMM, yyyy");
		return "Cars [mark=" + mark + ", model=" + model + ", numberPlate=" + numberPlate + ", regDate=" + regDate.get(Calendar.DAY_OF_MONTH) + "." + regDate.get(Calendar.MONTH) + "." + regDate.get(Calendar.YEAR) 
				+ ", carOwner=" + carOwner + "]";
	}

	public void addOwner(String newOwner) {
		carOwner.add(newOwner);
	}

}
