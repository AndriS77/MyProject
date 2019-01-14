package loomad;

import java.util.Calendar;

public class Koer extends Loom{

	private String varvus;

	public Koer(String nimi, String toug, Calendar sunniaeg, String varvus) {
		super(nimi, toug, sunniaeg);
		this.varvus = varvus;
	}
	
	/**
	 * @return the varvus
	 */
	public String getVarvus() {
		return varvus;
	}

	/**
	 * @param varvus the varvus to set
	 */
	public void setVarvus(String varvus) {
		this.varvus = varvus;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Koer [varvus=" + varvus + "]";
	}
	

}
