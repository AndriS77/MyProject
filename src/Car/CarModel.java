package Car;

public class CarModel {

	public String model;
	public String year;
	public CarType type;
	public CarOwner owner;
	
	
	
	public CarModel(String model, String year, CarType type, CarOwner owner) {
		super();
		this.model = model;
		this.year = year;
		this.type = type;
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "CarModel [model=" + model + ", year=" + year + ", type=" + type + ", owner=" + owner + "]";
	}
	public enum CarDocs {

		SUBARU, HONDA, TOYOTA, WOLKSVAGEN;
	}
	public enum CarType {
		SEDAAN, LUUKPÄRA, UNIVERSAAL;
	}
}
