import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Player;
import bean.Starters;

public class Start {

	private static List<String> participant = Arrays.asList("Maja", "Jakob", "Mama", "Papa", "Wetzi", "Alex");

	public Start() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("Berechen Kombinationen");
		List<Starters> teilnehmer = init();
		TurnamentCalculator calculator = new TurnamentCalculator(teilnehmer);
		calculator.calculateSingelPlayerTourney();

	}

	private static List<Starters> init() {
		Player maja = new Player("Maja");
		Player jakob = new Player("Kuba");
		Player dagmara = new Player("Dagmara");
		Player wetzi = new Player("Wetzi");
		Player alex = new Player("Alex");
		Player thomas = new Player("Thomas");

		ArrayList<Starters> list = new ArrayList<Starters>();
		list.add(maja);
		list.add(jakob);
		list.add(dagmara);
		list.add(alex);
		// list.add(thomas);
		// list.add(wetzi);

		return list;
	}

}
