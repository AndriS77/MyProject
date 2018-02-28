package Car;

import java.time.LocalDate;
import java.time.Period;

public class CarOwner {
	private String firstName;
	private String lastName;
	private String idCode;
	private LocalDate licenseDate;
	
	public Period tenure() {
		LocalDate today = LocalDate.now();
		Period p = Period.between(licenseDate, today);
		return p;
	}
}

