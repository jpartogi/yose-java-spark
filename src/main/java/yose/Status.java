package yose;

public class Status {
	private boolean alive;
	
	public Status(boolean alive){
		this.alive = alive;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
}
