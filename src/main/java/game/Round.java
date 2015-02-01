package game;

        import bean.Player;
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

        StringBuffer sb = new StringBuffer("Runde :"  + count + NEW_LINE );
      for (int i = 0; i<teams.size();i =i+2){
         sb.append(teams.get(i).palyerName() + " gegen " + teams.get(i+1).palyerName() + NEW_LINE );
      }
        return sb.toString();

    }
}
