package bean;

public class BasePlayer implements Starters {
	private String name;
	private boolean auszeit;

	public BasePlayer() {
		super();
	}

	public BasePlayer(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String palyerName() {

		return getName();
	}

	@Override
	public boolean hasAuszeit() {
		return auszeit;
	}

	@Override
	public void setAuszeit(boolean value) {
		this.auszeit = value;

	}

}
