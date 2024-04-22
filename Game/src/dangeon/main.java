package dangeon;

import lib.Input;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Meiro dangeon = new Meiro();

		int[] now = { dangeon.get_start_row(), dangeon.get_start_col() };
		while (true) {
			Panel[][] str_dangeon = dangeon.get_dangeon();
			now = control(str_dangeon, now);
			if (now[0] == dangeon.get_goal_row() && now[1] == dangeon.get_goal_col()) {
				System.out.println("終わり");
				break;
			}
		}
	}

	public static int[] control(Panel[][] dangeon, int[] start) {
		int now_row = start[0];
		int now_col = start[1];
		String ip = Input.getString("どちらに動かすか選んでください");
		System.out.println(dangeon[now_row][now_col]);
		Panel_wall_1.check_wall_1(dangeon[now_row][now_col].getname());
		Panel_wall_2.check_wall_2(dangeon[now_row][now_col].getname());
		Panel_wall_3.check_wall_3(dangeon[now_row][now_col].getname());
		switch (ip) {
		case "w":
			if (Panel.up == true) {
				now_row--;
			}
			break;
		case "s":
			if (Panel.down == true) {
				now_row++;
			}
			break;
		case "a":
			if (Panel.left == true) {
				now_col--;
			}
			break;
		case "d":
			if (Panel.right == true) {
				now_col++;
			}
			break;
		}
		Panel.up=true;
		Panel.down=true;
		Panel.left=true;
		Panel.right=true;
		//System.out.println(now_row + "&" + now_col);
		int[] now = { now_row, now_col };
		return now;

	}

	public static void check() {

	}

}
