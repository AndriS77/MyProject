package UT;

import java.util.List;

public class Raamat {
	
	public String nimi;
	public String ilmumisaasta;
	public String lehekylgedeArv;
	public String autor;
	public String keel;
	public String hinne;
	//public List<String> books;
	
	public Raamat(String nimi, String ilmumisaasta, String lehekylgedeArv, String autor, String keel, String hinne) {
		this.nimi = nimi;
		this.ilmumisaasta = ilmumisaasta;
		this.lehekylgedeArv = lehekylgedeArv;
		this.autor = autor;
		this.keel = keel;
		this.hinne = hinne;
		//this.books = new ArrayList<>();
	}

	@Override
	public String toString() {
		/*return "Raamat [nimi=" + nimi + ", ilmumisaasta=" + ilmumisaasta + ", lehekülgedeArv=" + lehekylgedeArv
				+ ", autor=" + autor + ", keel=" + keel + ", hinne=" + hinne + "]";*/

	
		return "\"" + nimi +
            "\" " + "(" + keel +
            "); Autor: " + autor +
            "; Ilmumisaasta: " + ilmumisaasta +
            "; " + lehekylgedeArv +
            " lk; hinne: " + hinne +
            "/10";
  }}
