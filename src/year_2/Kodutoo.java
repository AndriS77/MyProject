package year_2;

public class Kodutoo {

	public static void main(String[] args) {
		Kodutoo kodutooObject = new Kodutoo ();
System.out.println("Hinne on: " + kodutooObject.valueGrade(3));

	}
	private String valueGrade(int num) {
		switch (num) {
		case 1:
			return "Kukkusid läbi";
		case 2:
			return "Kukkusid läbi veidi vähem";
		case 3:
			return "Rahuldav";
		case 4:
			return "Hea";
		case 5:
			return "Suurepärane";		
		default:
			throw new IllegalArgumentException("Hindamine toimub 5-palli süstemis");
		}
	}
}
