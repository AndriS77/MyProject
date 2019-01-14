package loomad;

import java.time.LocalDate;
import java.util.Calendar;

public class Kass extends Loom {
	
	private Loomapass loomapass;

	public Kass(String nimi, String toug, LocalDate sunniaeg, Loomapass loomapass) {
		super(nimi, toug, sunniaeg);
		this.loomapass = loomapass;
	}

	/**
	 * @return the loomapass
	 */
	public Loomapass getLoomapass() {
		return loomapass;
	}

	/**
	 * @param loomapass the loomapass to set
	 */
	public void setLoomapass(Loomapass loomapass) {
		this.loomapass = loomapass;
	}
	

}
