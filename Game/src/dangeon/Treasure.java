package dangeon;

public class Treasure extends Event{
	public Treasure(int row, int col) {
		super(row,col,"Treasure");
	}
	public void action() {
		System.out.println("宝を見つけた");
	}
}
