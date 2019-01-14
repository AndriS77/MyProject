package ruumid;

public class Ruum {

	private int korrus;
	private String number;
	
	public Ruum(int korrus, String number) {
		this.korrus = korrus;
		this.number = number;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Ruum [korrus=" + korrus + ", " + (number != null ? "number=" + number : "") + "]";
	}
}
