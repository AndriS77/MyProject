 package Headphone;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Student {

	//private String firstname;
	//private String lastname;
	//private Calendar birthdate;
	private String name;
	private LocalDate dateOfBirth;
	private List<Subject> subjects;
	private Type type;
	private IdentityCode idCode;
	
	public Student(String name, LocalDate dateOfBirth, List<Subject> subjects, Type type, IdentityCode idCode) {
		
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.subjects = subjects;
		this.type = type;
		this.idCode = idCode;
	}


	public Student(String nime, LocalDate dateOfBirth, Type type, String idCode) {
		this.name = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
		this.idCode = new IdentityCode(idCode, Country.ESTONIA);
	}
	
	public Student(String nime, LocalDate dateOfBirth, Type type, String idCode, Country idCountry) {
		this.name = nime;
		this.dateOfBirth = dateOfBirth;
		this.subjects = new ArrayList<Subject>();
		this.type = type;
		this.idCode = new IdentityCode(idCode, idCountry);
	}
	/**
	 * @return the nime
	 */
	public String getNime() {
		return name;
	}

	/**
	 * @param nime the nime to set
	 */
	public void setNime(String nime) {
		this.name = nime;
	}

	/**
	 * @return the dateOfBirth
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the subjects
	 */
	public List<Subject> getSubjects() {
		return subjects;
	}

	
	public void addSubject(Subject subject) {
		this.subjects.add(subject);
	}
	
	public String getAgeAsString() {
		LocalDate today = LocalDate.now();
		Period p = Period.between(dateOfBirth, today);
		long p2 = ChronoUnit.DAYS.between(dateOfBirth, today);
		
		return this.name + " is " + p.getYears() + " years, " + p.getMonths() +
		                   " months, and " + p.getDays() +
		                   " days old. (" + p2 + " days total)";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [" + (name != null ? "nime=" + name + ", " : "")
				+ (dateOfBirth != null ? "dateOfBirth=" + dateOfBirth + ", " : "")
				+ (subjects != null ? "subjects=" + subjects + ", " : "") + (type != null ? "type=" + type + ", " : "")
				+ (idCode != null ? "idCode=" + idCode : "") + "]";
	
	}
}
