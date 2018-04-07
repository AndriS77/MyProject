package UT;

import java.util.List;

public class Raamat {

	public String nimi;
	public String ilmumisaasta;
	public String lehekylgedeArv;
	public String autor;
	public String keel;
	public String hinne;

	public Raamat() {
	}

	public Raamat(String nimi, String ilmumisaasta, String lehekylgedeArv, String autor, String keel, String hinne) {
		this.nimi = nimi;
		this.ilmumisaasta = ilmumisaasta;
		this.lehekylgedeArv = lehekylgedeArv;
		this.autor = autor;
		this.keel = keel;
		this.hinne = hinne;
		// this.books = new ArrayList<>();
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getIlmumisaasta() {
		return ilmumisaasta;
	}

	public void setIlmumisaasta(String ilmumisaasta) {
		this.ilmumisaasta = ilmumisaasta;
	}

	public String getLehekylgedeArv() {
		return lehekylgedeArv;
	}

	public void setLehekylgedeArv(String lehekylgedeArv) {
		this.lehekylgedeArv = lehekylgedeArv;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getKeel() {
		return keel;
	}

	public void setKeel(String keel) {
		this.keel = keel;
	}

	public String getHinne() {
		return hinne;
	}

	public void setHinne(String hinne) {
		this.hinne = hinne;
	}

	@Override
	public String toString() {

		return "\"" + nimi + "\" " + "(" + keel + "); Autor: " + autor + "; Ilmumisaasta: " + ilmumisaasta + "; "
				+ lehekylgedeArv + " lk; hinne: " + hinne + "/10";
	}
}
