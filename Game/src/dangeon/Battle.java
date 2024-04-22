package dangeon;

public class Battle extends Event{
	public Battle(int row, int col) {
		super(row,col,"battle");
	}
	public void action() {
		System.out.println("戦闘が始まる");
	}
}
