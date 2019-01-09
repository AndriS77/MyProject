package mootorsoidukid;

public class MootorsoidukidMain {

	public static void main(String[] args) {
	/*	Auto auto1 = new Auto(22, 2, 2012, "Ford", "123 abc", 210);
		auto1.pidurda();
		auto1.pidurda();
		auto1.pidurda();
		System.out.println(auto1);*/
		
		Takso takso1 = new Takso(45, 2, 2013, "Mercedes", "456 def", 220);
		takso1.satiLabisoiduAndmed(2.1, 300000, 7.8);
		
		takso1.lisaUksed(new Uks(false, UkseLiik.EESMINE_PAREM), new Uks(true, UkseLiik.EESMINE_VASAK));
		
		takso1.getTaksoKasum(1.3, 12000);
		System.out.println(takso1.getTaksoKasum(1.2212, 10));
		System.out.println(takso1.getKytusekulu(1.2));
	}

}
