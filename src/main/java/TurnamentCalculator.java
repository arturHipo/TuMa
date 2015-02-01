import bean.Starters;
import game.Round;
import game.Tabel;

import java.util.ArrayList;
import java.util.List;

public class TurnamentCalculator {

    private final List<Starters> starters;

    public TurnamentCalculator(List<Starters> players) {
        this.starters = players;
    }

    public void calculateTeamtTourney() {

    }

    public void calculateSingelPlayerTourney() {

        if (justNumberOfParticipant()) {
            List<Round> tournament = calculate(starters);
            System.out.print(tournament);
        } else {
            for (Starters item : starters) {
                // definire Aussetzer
                //TODO Preufen ob das der richtige weg ist ????
                item.setAuszeit(true);
            }
        }

     // Erzeugung eines Turnierplans mit geraden anzahl an Teilnehmern
     // calculate(starters);
    }

    private List<Round> calculate(List<Starters> list) {
        int i = 0;
        int anzahlTeilnehmer = list.size();
        ArrayList<Starters> roundPlayers = null;
        ArrayList<Round> turnierRunden = new ArrayList<Round>();

        Round runde = null;
        while (i < anzahlTeilnehmer - 1) {
            roundPlayers = new ArrayList<Starters>();
            //System.out.println("Spiel " + (i + 1) + ":");

            runde = new Round(i + 1);
            runde.setTabel(Tabel.TABLE_1);

           // System.out.println(list.get(anzahlTeilnehmer - 1).palyerName() + " : " + list.get(i).palyerName());

            roundPlayers.add(getTeilnehmer(list, anzahlTeilnehmer - 1));
            roundPlayers.add(getTeilnehmer(list, i));

            int j = 1;
            while (j < anzahlTeilnehmer / 2) {
                int a = i - j;
                int b = i + j;
                if (a < 0)
                    a = a + (anzahlTeilnehmer - 1);
                if (b > anzahlTeilnehmer - 2)
                    b = b - (anzahlTeilnehmer - 1);
             //   System.out.println(list.get(a).palyerName() + " : " + list.get(b).palyerName());
                roundPlayers.add(getTeilnehmer(list, a));
                roundPlayers.add(getTeilnehmer(list, b));

                j = j + 1;
            }
            i = i + 1;
            runde.setTeams(roundPlayers);
            turnierRunden.add(runde);
        }

        return turnierRunden;
    }

    private Starters getTeilnehmer(List<Starters> list, int i) {
        return list.get(i);
    }

    private boolean justNumberOfParticipant() {
        return starters.size() % 2 == 0;
    }


    public String printTournament(List<Round> list) {
        StringBuilder sb = new StringBuilder();
        for (Round r : list){
            sb.append(r.toString());
        }

        return sb.toString();
    }
}
