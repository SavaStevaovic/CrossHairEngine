import java.net.InetAddress;

public class Player {
	private int x, y;

	public Player(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void move(int xm,int ym){
		this.x+=xm;
		this.y+=ym;
	}
}