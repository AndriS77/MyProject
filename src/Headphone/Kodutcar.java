package Headphone;

public class Kodutcar {

	public static void main(String[] args) {
		Car auto1 = new Car("GT", "sport", "EV 001", "24.09.2007");
		System.out.println(auto1);
		
		auto1.addOwner("Tiit Sukk");
		auto1.addOwner("Eve Libe");
		
		System.out.println(auto1);
	}

}
