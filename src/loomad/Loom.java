package loomad;

import java.time.LocalDate;
import java.util.Calendar;

public class Loom {

	private String nimi;
	private String toug;
	//private Calendar sunniaeg;
	 private LocalDate sunniaeg;
	
	public Loom(String nimi, String toug, LocalDate sunniaeg) {
		this.nimi = nimi;
		this.toug = toug;
		this.sunniaeg = sunniaeg;
	}
	

	/**
	 * @return the nimi
	 */
	public String getNimi() {
		return nimi;
	}


	/**
	 * @param nimi the nimi to set
	 */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}


	/**
	 * @return the toug
	 */
	public String getToug() {
		return toug;
	}


	/**
	 * @param toug the toug to set
	 */
	public void setToug(String toug) {
		this.toug = toug;
	}


	/**
	 * @return the sunniaeg
	 */
	public LocalDate getSunniaeg() {
		return sunniaeg;
	}


	/**
	 * @param sunniaeg the sunniaeg to set
	 */
	public void setSunniaeg(LocalDate sunniaeg) {
		this.sunniaeg = sunniaeg;
	}

	public  String loomaInfo() {
		return nimi;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loom [nimi=" + nimi + ", toug=" + toug + ", sunniaeg=" + sunniaeg + "]";
	}
	
}
