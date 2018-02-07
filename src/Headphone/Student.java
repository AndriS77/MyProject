package Headphone;

public class Student {

	private String firstname;
	private String lastname;
	private int birthday;
	private String subjects;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	@Override
	public String toString() {
		return "Student [" + (firstname != null ? "firstname=" + firstname + ", " : "")
				+ (lastname != null ? "lastname=" + lastname + ", " : "") + "birthday=" + birthday + ", "
				+ (subjects != null ? "subjects=" + subjects : "") + "]";
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}

	public String getSubjects() {
		return subjects;
	}

	public void setSubjects(String subjects) {
		this.subjects = subjects;
	}
 }
