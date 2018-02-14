 package Headphone;

import java.util.ArrayList;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.List;

public class Student {

	private String firstname;
	private String lastname;
	private Calendar birthdate;
	//private String subjects;
	private List<String> subjects;
	//= new ArrayList<>();
	

	public Student(String firstname, String lastname, List<String> subjects) {	
		this.firstname = firstname;
		this.lastname = lastname;
		this.subjects = subjects;
	}



	public Student(String firstname, String lastname, Calendar birthdate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthdate = birthdate;
	}


	
	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public Calendar getBirthdate() {
		return birthdate;
	}



	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}



	@Override
	public String toString() {
		return "Student [" + (firstname != null ? "firstname=" + firstname + ", " : "")
				+ (lastname != null ? "lastname=" + lastname + ", " : "") + "birthday=" + birthdate + ", "
				+ (subjects != null ? "subjects=" + subjects : "") + "]";
	}
 }
