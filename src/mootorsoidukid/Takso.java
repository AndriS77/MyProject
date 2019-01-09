package mootorsoidukid;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Takso extends Auto {

	private double kilomeetriHind;
	private int odomeetriNait;
	private double keskmineKytusekulu;
	private List<Uks> uksed = new ArrayList<>();
	private double taksoKasum;
	
	public Takso(int hetkeKiirus, int telgedeArv, int valjalaskeAasta, String mark, String numbriMark,
			int maksimaalneKiirus) {
		super(hetkeKiirus, telgedeArv, valjalaskeAasta, mark, numbriMark, maksimaalneKiirus);
	}

	public void satiLabisoiduAndmed(double kilomeetriHind, int odomeetriNait, double keskmineKytusekulu) {
		this.kilomeetriHind = kilomeetriHind;
		this.odomeetriNait = odomeetriNait;
		this.keskmineKytusekulu = keskmineKytusekulu;
	
	}
	
	public void lisaUksed(Uks... uksed) {
		for (Uks uks : uksed) {
			this.uksed.add(uks);
		}
	}

	/**
	 * @return the taksoKasum
	 */
	public double getTaksoKasum(double kytuseHind, double labitudTyhjalt) {
		double kasum = (this.odomeetriNait - (this.odomeetriNait * (labitudTyhjalt/100))) * this.kilomeetriHind - 
				getKytusekulu(kytuseHind);
		BigDecimal bd = new BigDecimal(Double.toString(kasum));
		bd = bd.setScale(3, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	
	
	public double getKytusekulu(double kytuseHind) {
		double kytuseKulu = this.odomeetriNait/this.keskmineKytusekulu * kytuseHind;
		BigDecimal bd = new BigDecimal(Double.toString(kytuseKulu));
		bd = bd.setScale(3, RoundingMode.HALF_UP);
		return bd.doubleValue();

	}

	/**
	 * @param taksoKasum the taksoKasum to set
	 */
	public void setTaksoKasum(double taksoKasum) {
		this.taksoKasum = taksoKasum;
	}
	
}
