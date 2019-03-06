package UT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Game {

	private List<Round> rounds;
	private Integer price;
	private boolean fiftyfifty = true;

	public Game() {
		this.rounds = new ArrayList<>();
		rounds.add(new Round("Mitu nais presidenti on Eestis olnud?", new String[] { "0", "1", "2", "3" }, "b", 100));
		rounds.add(new Round("Mis aastal avati ERM?", new String[] { "1935", "1937", "2017", "2014" }, "c", 200));
		rounds.add(new Round("Mitu värvi on Prantsuse lipul?", new String[] { "4", "1", "5", "3" }, "d", 300));
		rounds.add(new Round("Mitmel olümpiamängudel on osalenud Enn Sellik?", new String[] { "4", "5", "2", "0" }, "c",
				500));
		rounds.add(new Round("Milline neist on tuntud Hiina roog?",
				new String[] { "Pekingi hani", "Pekingi koer", "Pekingi tuvi", "Pekingi part" }, "d", 1000));
		rounds.add(new Round("Kes on Euroopa parlamendi president?",
				new String[] { "Antonio Tajani", "Donald Tusk", "Pilar Ayuso", "Tim Aker" }, "a", 2000));
		rounds.add(new Round("Mis film võitis 2018 aasta oskaritel parima filmi auhinna?",
				new String[] { "Darkest Hour", "Call me by your name", "Shape of water", "Lady Bird" }, "c", 4000));
		rounds.add(new Round("Milline riik on võitnud kõige rohkem kordi eurovisiooni lauluvõistluse?",
				new String[] { "Rootsi", "Inglismaa", "Iirimaa", "Norra" }, "c", 8000));
		rounds.add(new Round("Mitmes USA president on Donald Trump?", new String[] { "46", "36", "45", "48" }, "c",
				16000));
		rounds.add(new Round("Mis aastal ilmus esmatrük raamatust \"Kolme katku vahel\"",
				new String[] { "1912", "1897", "1981", "1970" }, "d", 32000));
		rounds.add(new Round("Millises riigis seadustati esimesena sammasooliste abielud?",
				new String[] { "Holland", "Hispaania", "Venemaa", "USA" }, "a", 64000));
		rounds.add(new Round("Mis on paavst Franciscuse pärisnimi?", new String[] { "Karol Józef Wojtyła",
				"Jorge Mario Bergoglio", "Bartolomeo Alberto Cappellari", "Clemens" }, "b", 125000));
		rounds.add(new Round("Mis riigi hümnil järgnevatest pole sõnu?",
				new String[] { "Saksamaa", "USA", "Vatikan", "Hispaania" }, "d", 250000));
		rounds.add(new Round("Milline on maailma suurim kulla kevandus?",
				new String[] { "Boddington mine", "Vaal River", "Goldstrike", "Grasberg Mine" }, "d", 500000));
		rounds.add(
				new Round(
						"Mis raamatu avaldas Stephen Hawking aastal 1988?", new String[] { "The Universe in a Nutshell",
								"On the Shoulders of Giants", "My Brief History", "A Brief History of Time" },
						"d", 1000000));

	}

	public List<Round> getRounds() {
		return rounds;
	}

	public Integer getPrice() {
		return price;
	}

	public String fiftyFifity(String[] choices, String answer) {
		fiftyfifty = false;
		Map<String, String> map = new HashMap<>();
		map.put("a", choices[0]);
		map.put("b", choices[1]);
		map.put("c", choices[2]);
		map.put("d", choices[3]);

		Map<Integer, String> chrs = new HashMap<>();
		chrs.put(0, "a");
		chrs.put(1, "b");
		chrs.put(2, "c");
		chrs.put(3, "d");

		String correct = answer + ": " + map.get(answer);
		map.remove(answer);

		Random random = new Random();
		String choice = map.get(map.keySet().toArray()[random.nextInt(2)]);

		int index = getIndex(choices, choice);

		if (index < getIndex(chrs.values().toArray(), answer)) {
			return chrs.values().toArray()[index] + ": " + choice + "\n" + correct;
		}

		return correct + "\n" + chrs.values().toArray()[index] + ": " + choice;

	}

	private int getIndex(Object[] choices, String choice) {
		for (int i = 0; i < choices.length; i++) {
			if (choice.equals(choices[i].toString())) {
				return i;
			}
		}
		return -1;
	}

	public boolean isFiftyfifty() {
		return fiftyfifty;

	}

}
