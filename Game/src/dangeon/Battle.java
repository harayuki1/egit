package dangeon;

import battle.Player;
import battle.battle_phase;

public class Battle extends Event{
	public static Player[] player = { new Player("Player1", 10, 10, 1, 1, 1, 1, 1,""),
			new Player("Player2", 10, 10, 1, 1, 1, 1, 1,""),
			new Player("Player3", 10, 10, 1, 1, 1, 1, 1,"") };
	public Battle(int row, int col) {
		super(row,col,"battle");
	}
	public void action() {
		battle_phase bt = new battle_phase();
		bt.battle(player);
	}
}
