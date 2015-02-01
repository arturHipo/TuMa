package bean;

public class Player extends BasePlayer {
	private int points;

	public Player(String name) {
		super(name);
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
