package ruumid;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Arvutiklass extends Klassiruum {
	private List<Arvuti> arvutid;

	public Arvutiklass(int korrus, String number, int oppekohtadeArv) {
		super(korrus, number, oppekohtadeArv);
		this.arvutid = new ArrayList<Arvuti>();
	}

	public void lisaArvuti(Arvuti arvuti) {
		this.arvutid.add(arvuti);
	}
	
	public void lisaArvuti(String nimetus, Calendar arvelevotuKp) {
		this.arvutid.add(new Arvuti(nimetus, arvelevotuKp));
	}	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Avutiklass [" + (arvutid != null ? "arvutid=" + arvutid + ", " : "")
				+ (super.toString() != null ? super.toString() : "") + "]";
	}

	
	
}
