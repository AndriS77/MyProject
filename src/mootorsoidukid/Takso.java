package mootorsoidukid;

import java.util.ArrayList;
import java.util.List;

public class Takso extends Auto {

	private double kilomeetriHind;
	private int odomeetriNait;
	private double keskmineKytusekulu;
	private List<Uks> uksed = new ArrayList<>();
	
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
}
