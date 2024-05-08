package dangeon;
//今は使わない
/*
public class Map {
	public static void visualize(Panel[][] dangeon, int start_row, int start_col, int goal_row, int goal_col) {
		String[][] draw = new String[5 * dangeon.length][dangeon[0].length];
		for (int i = 0; i < dangeon.length; i++) {
			for (int j = 0; j < dangeon[i].length; j++) {
				if (dangeon[i][j].getname() == "wall_1_up") {
					draw[5 * i][j] = "-----";
					draw[5 * i + 1][j] = "     ";
					draw[5 * i + 2][j] = "     ";
					draw[5 * i + 3][j] = "     ";
					draw[5 * i + 4][j] = "     ";
				} else if (dangeon[i][j].getname() == "wall_1_left") {
					draw[5 * i][j] = "|    ";
					draw[5 * i + 1][j] = "|    ";
					draw[5 * i + 2][j] = "|    ";
					draw[5 * i + 3][j] = "|    ";
					draw[5 * i + 4][j] = "|    ";
				} else if (dangeon[i][j].getname() == "wall_1_right") {
					draw[5 * i][j] = "    |";
					draw[5 * i + 1][j] = "    |";
					draw[5 * i + 2][j] = "    |";
					draw[5 * i + 3][j] = "    |";
					draw[5 * i + 4][j] = "    |";
				} else if (dangeon[i][j].getname() == "wall_1_down") {
					draw[5 * i][j] = "     ";
					draw[5 * i + 1][j] = "     ";
					draw[5 * i + 2][j] = "     ";
					draw[5 * i + 3][j] = "     ";
					draw[5 * i + 4][j] = "-----";
				} else if (dangeon[i][j].getname() == "wall_2_upright") {
					draw[5 * i][j] = "----+";
					draw[5 * i + 1][j] = "    |";
					draw[5 * i + 2][j] = "    |";
					draw[5 * i + 3][j] = "    |";
					draw[5 * i + 4][j] = "    |";
				} else if (dangeon[i][j].getname() == "wall_2_upleft") {
					draw[5 * i][j] = "+----";
					draw[5 * i + 1][j] = "|    ";
					draw[5 * i + 2][j] = "|    ";
					draw[5 * i + 3][j] = "|    ";
					draw[5 * i + 4][j] = "|    ";
				} else if (dangeon[i][j].getname() == "wall_2_downleft") {
					draw[5 * i][j] = "|    ";
					draw[5 * i + 1][j] = "|    ";
					draw[5 * i + 2][j] = "|    ";
					draw[5 * i + 3][j] = "|    ";
					draw[5 * i + 4][j] = "+----";
				} else if (dangeon[i][j].getname() == "wall_2_downright") {
					draw[5 * i][j] = "    |";
					draw[5 * i + 1][j] = "    |";
					draw[5 * i + 2][j] = "    |";
					draw[5 * i + 3][j] = "    |";
					draw[5 * i + 4][j] = "----+";
				} else if (dangeon[i][j].getname() == "wall_2_leftright") {
					draw[5 * i][j] = "|   |";
					draw[5 * i + 1][j] = "|   |";
					draw[5 * i + 2][j] = "|   |";
					draw[5 * i + 3][j] = "|   |";
					draw[5 * i + 4][j] = "|   |";
				} else if (dangeon[i][j].getname() == "wall_2_updown") {
					draw[5 * i][j] = "-----";
					draw[5 * i + 1][j] = "     ";
					draw[5 * i + 2][j] = "     ";
					draw[5 * i + 3][j] = "     ";
					draw[5 * i + 4][j] = "-----";
				} else if (dangeon[i][j].getname() == "wall_3_noup") {
					draw[5 * i][j] = "|   |";
					draw[5 * i + 1][j] = "|   |";
					draw[5 * i + 2][j] = "|   |";
					draw[5 * i + 3][j] = "|   |";
					draw[5 * i + 4][j] = "+---+";
				} else if (dangeon[i][j].getname() == "wall_3_nodown") {
					draw[5 * i][j] = "+---+";
					draw[5 * i + 1][j] = "|   |";
					draw[5 * i + 2][j] = "|   |";
					draw[5 * i + 3][j] = "|   |";
					draw[5 * i + 4][j] = "|   |";
				} else if (dangeon[i][j].getname() == "wall_3_noleft") {
					draw[5 * i][j] = "----+";
					draw[5 * i + 1][j] = "    |";
					draw[5 * i + 2][j] = "    |";
					draw[5 * i + 3][j] = "    |";
					draw[5 * i + 4][j] = "----+";
				} else if (dangeon[i][j].getname() == "wall_3_noright") {
					draw[5 * i][j] = "+----";
					draw[5 * i + 1][j] = "|    ";
					draw[5 * i + 2][j] = "|    ";
					draw[5 * i + 3][j] = "|    ";
					draw[5 * i + 4][j] = "+----";
				} else if (dangeon[i][j].getname() == "wall_4") {
					draw[5 * i][j] = "+---+";
					draw[5 * i + 1][j] = "|   |";
					draw[5 * i + 2][j] = "|   |";
					draw[5 * i + 3][j] = "|   |";
					draw[5 * i + 4][j] = "+---+";
				} else if (dangeon[i][j].getname() == "wall_cross") {
					draw[5 * i][j] = "     ";
					draw[5 * i + 1][j] = "     ";
					draw[5 * i + 2][j] = "     ";
					draw[5 * i + 3][j] = "     ";
					draw[5 * i + 4][j] = "     ";
				}
			}

		}
		draw[start_row * 5 + 2][start_col] = "  S  ";
		draw[goal_row * 5 + 2][goal_col] = "  G  ";
		for (int i = 0; i < draw.length; i++) {
			for (int j = 0; j < draw[i].length; j++) {
				System.out.print(draw[i][j]);
			}
			System.out.println();
		}

	}
}
*/
