package mootorsoidukid;

import java.util.Calendar;

public class Auto extends Mootorsoiduk{

	// privaatsed valjad
	private String mark;
	private String numbriMark;
	private int maksimaalneKiirus;
	
	public Auto(int hetkeKiirus, int telgedeArv, int valjalaskeAasta, String mark, String numbriMark,
			int maksimaalneKiirus) {
		super(hetkeKiirus, telgedeArv, valjalaskeAasta);
		this.mark = mark;
		this.numbriMark = numbriMark;
		this.maksimaalneKiirus = maksimaalneKiirus;
	}

	/* (non-Javadoc)
	 * @see mootorsoidukid.Mootorsoiduk#kiirenda()
	 */
	@Override
	public void kiirenda() {
		if(this.getHetkeKiirus() < this.maksimaalneKiirus) {
			super.kiirenda();			
		}
	}
	
	public void kiirenda(int kiirus) {
		if(kiirus < this.maksimaalneKiirus) {
			this.setHetkeKiirus(kiirus);
		}
	}
	
	/* (non-Javadoc)
	 * @see mootorsoidukid.Mootorsoiduk#pidurda()
	 */
	@Override
	public void pidurda() {
		if(this.getHetkeKiirus() > 10) {
			super.pidurda();			
		} else {
			this.setHetkeKiirus(0);
		}
	}

	public int annaVanus() {
		int aastaPraegu = Calendar.getInstance().get(Calendar.YEAR);
		return aastaPraegu - this.getValjalaskeAasta();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Auto [" + (mark != null ? "mark=" + mark + ", " : "")
				+ (numbriMark != null ? "numbriMark=" + numbriMark + ", " : "") + "maksimaalneKiirus="
				+ maksimaalneKiirus + ", hetkeKiirus=" + getHetkeKiirus() + ", telgedeArv=" + getTelgedeArv()
				+ ", valjalaskeAasta=" + getValjalaskeAasta() + "]";
	}

}
