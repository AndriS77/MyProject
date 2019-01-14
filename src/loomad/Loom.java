package loomad;

import java.util.Calendar;

public class Loom {

	private String nimi;
	private String toug;
	private Calendar sunniaeg;
	
	public Loom(String nimi, String toug, Calendar sunniaeg) {
		this.nimi = nimi;
		this.toug = toug;
		this.sunniaeg = sunniaeg;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loom [nimi=" + nimi + ", toug=" + toug + ", sunniaeg=" + sunniaeg + "]";
	}
	
}
