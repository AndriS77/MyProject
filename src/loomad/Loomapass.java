package loomad;

import java.util.Calendar;

public class Loomapass {

	private String nimi;
	private String toug;
	private String omanik;
	private Calendar sunnipaev;
	
	public Loomapass(String nimi, String toug, String omanik, Calendar sunnipaev) {
		this.nimi = nimi;
		this.toug = toug;
		this.omanik = omanik;
		this.sunnipaev = sunnipaev;
		
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
	 * @return the omanik
	 */
	public String getOmanik() {
		return omanik;
	}

	/**
	 * @param omanik the omanik to set
	 */
	public void setOmanik(String omanik) {
		this.omanik = omanik;
	}

	/**
	 * @return the sunnipaev
	 */
	public Calendar getSunnipaev() {
		return sunnipaev;
	}

	/**
	 * @param sunnipaev the sunnipaev to set
	 */
	public void setSunnipaev(Calendar sunnipaev) {
		this.sunnipaev = sunnipaev;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Loomapass [nimi=" + nimi + ", toug=" + toug + ", omanik=" + omanik + ", sunnipaev=" + sunnipaev + "]";
	}
	
	
}
