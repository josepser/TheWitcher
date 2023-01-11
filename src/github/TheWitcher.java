package github;

public class TheWitcher {
	private String name;
	private int health;
	private boolean hasSoul;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isHasSoul() {
		return hasSoul;
	}

	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}

	public boolean isDeath() {
		if (health == 0) {
			return true;
		} else if (!hasSoul) {
			return false;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		TheWitcher brujo = new TheWitcher();
		brujo.setName("Geralt de Rivia");
		brujo.setHealth(1);
		brujo.setHasSoul(true);
		if(brujo.isDeath()) {
			System.out.println(brujo.getName()+" está muerto");
		}else {
			System.out.println(brujo.getName()+" está vivo");
		}
	}
}
