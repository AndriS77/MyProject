package mootorsoidukid;

public abstract class Mootorsoiduk {

	// privaatsed valjad
	private int hetkeKiirus;
	private int telgedeArv;
	private int valjalaskeAasta;	
	
	// konstruktorid
	public Mootorsoiduk() {}
	
	public Mootorsoiduk(int hetkeKiirus, int telgedeArv, int valjalaskeAasta) {
		this.hetkeKiirus = hetkeKiirus;
		this.telgedeArv = telgedeArv;
		this.valjalaskeAasta = valjalaskeAasta;
	}
	
	public Mootorsoiduk(int hetkeKiirus) {
		this.hetkeKiirus = hetkeKiirus;
	}

	
	// Getterid ja Setterid
	/**
	 * @return the hetkeKiirus
	 */
	public int getHetkeKiirus() {
		return hetkeKiirus;
	}

	/**
	 * @param hetkeKiirus the hetkeKiirus to set
	 */
	public void setHetkeKiirus(int hetkeKiirus) {
		this.hetkeKiirus = hetkeKiirus;
	}

	/**
	 * @return the telgedeArv
	 */
	public int getTelgedeArv() {
		return telgedeArv;
	}

	/**
	 * @param telgedeArv the telgedeArv to set
	 */
	public void setTelgedeArv(int telgedeArv) {
		this.telgedeArv = telgedeArv;
	}

	/**
	 * @return the valjalaskeAasta
	 */
	public int getValjalaskeAasta() {
		return valjalaskeAasta;
	}

	/**
	 * @param valjalaskeAasta the valjalaskeAasta to set
	 */
	public void setValjalaskeAasta(int valjalaskeAasta) {
		this.valjalaskeAasta = valjalaskeAasta;
	}
	
	public void kiirenda() {
		//this.hetkeKiirus = this.hetkeKiirus + 10;
		this.hetkeKiirus += 10;
	}
	
	public void pidurda() {
		this.hetkeKiirus -= 10;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mootorsoiduk [hetkeKiirus=" + hetkeKiirus + ", telgedeArv=" + telgedeArv + ", valjalaskeAasta="
				+ valjalaskeAasta + "]";
	}
}
