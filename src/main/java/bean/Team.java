package bean;

import java.util.Arrays;
import java.util.List;

public class Team extends BasePlayer implements Starters {

	private List<Player> players;
	private String teamName;

	public Team() {
		super();
	}

	public Team(List<Player> players) {

		this.players = players;
	}

	public Team(Player playerFirst, Player playerSecond) {
		players = Arrays.asList(playerFirst, playerSecond);
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public String getTeamName() {
		return teamName;
	}

    public void setTeamName(String teamName) {
		this.teamName = teamName;
	}


    public Team(String name) {
        super(name);
    }

    @Override
	public String palyerName() {
		return getTeamName() + " :" + players.get(0).getName() + "/" + players.get(1).getName();
	}


}
