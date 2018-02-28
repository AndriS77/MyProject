package Car;

public class IdentitiCode {
	private String idCode;
	private Country country;
	
	public IdentitiCode(String idCode, Country country) {
		this.idCode = idCode;
		this.country = country;
	}

	@Override
	public String toString() {
		return "IdentitiCode [idCode=" + idCode + ", country=" + country + "]";
	}
}

