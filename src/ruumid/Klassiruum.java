package ruumid;

public class Klassiruum extends Ruum {

	private int oppekohtadeArv;
	private boolean onProjektor;
	
	public Klassiruum(int korrus, String number, int oppekohtadeArv) {
		super(korrus, number);
		this.oppekohtadeArv = oppekohtadeArv;
	}
	
	public void satiProjektor(boolean onProjektor) {
		this.onProjektor = onProjektor;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Klassiruum [oppekohtadeArv=" + oppekohtadeArv + ", onProjektor=" + onProjektor + ", "
				+ (super.toString() != null ? super.toString() : "") + "]";
	}
	
}
