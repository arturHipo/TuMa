package game;

import bean.Starters;
import bean.Team;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Created by Artur on 01.02.15.
 */
public class Round {

    private static final String NEW_LINE = "\n";
    private int count;
    private List<? extends Starters> teams;

    private Tabel tabel;

    public Round(int count) {
        this.count = count;
    }

    public  Round(List<?extends Starters>teams, int count) {
        this.teams = teams;
        this.count = count;
    }


    public Tabel getTabel() {
        return tabel;
    }

    public void setTabel(Tabel tabel) {
        this.tabel = tabel;
    }



    public int getCount() {
        return count;
    }

    public void setTeams(List<? extends Starters> teams) {
        this.teams = teams;
    }

    public List<? extends Starters> getTeams() {
        return teams;
    }


    private boolean isTeamGame() {
        return teams != null && teams.get(0) != null && teams.get(0) instanceof Team;
    }

    @Override
    public String toString() {

        return "Runde :"  + count + NEW_LINE +
                teams.get(0).palyerName() + " gegen " + teams.get(1).palyerName() + NEW_LINE;

    }
}
