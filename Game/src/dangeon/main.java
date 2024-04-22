package dangeon;

import lib.Input;

public class main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		
		Meiro dangeon = new Meiro();
		dangeon.set_event(setting(dangeon));
		int[] now = { dangeon.get_start_row(), dangeon.get_start_col() };
		
		while (true) {
			now = control(dangeon.get_dangeon(), now);

			if (now[0] == dangeon.get_goal_row() && now[1] == dangeon.get_goal_col()) {
				System.out.println("終わり");
				break;
			} else {
				for (int i = 0; i < dangeon.get_event().length; i++) {
					if (now[0] == dangeon.get_event()[i].get_row() && now[1] == dangeon.get_event()[i].get_col()) {
						dangeon.get_event()[i].action();
					}
				}

			}
		}
	}

	public static int[] control(Panel[][] dangeon, int[] start) {
		int now_row = start[0];
		int now_col = start[1];
		String ip = Input.getString("どちらに動かすか選んでください");

		//System.out.println(dangeon[now_row][now_col].getname());
		Panel_wall_1.check_wall_1(dangeon[now_row][now_col].getname());
		Panel_wall_2.check_wall_2(dangeon[now_row][now_col].getname());
		Panel_wall_3.check_wall_3(dangeon[now_row][now_col].getname());
		switch (ip) {
		case "w":
			if (Panel.up == true) {
				now_row--;
			} else {
				System.out.println("いけません");

			}
			break;
		case "s":
			if (Panel.down == true) {
				now_row++;
			} else {
				System.out.println("いけません");

			}
			break;
		case "a":
			if (Panel.left == true) {
				now_col--;
			} else {
				System.out.println("いけません");

			}
			break;
		case "d":
			if (Panel.right == true) {
				now_col++;
			} else {
				System.out.println("いけません");

			}
			break;
		}
		Panel.up = true;
		Panel.down = true;
		Panel.left = true;
		Panel.right = true;
		//System.out.println(now_row + "&" + now_col);
		int[] now = { now_row, now_col };
		return now;

	}

	public static Event[] setting(Meiro dangeon) {
		Event[] e = new Event[3];
		for(int i=0; i<e.length;i++) {
			int rand_row = (int) (Math.random() * dangeon.get_dangeon().length);
			int rand_col = (int) (Math.random() * dangeon.get_dangeon()[0].length);
			int dice = (int) (Math.random() * 3 + 1);
			
			switch(dice) {
			case 1:
				e[i]=new Treasure(rand_row,rand_col);
				break;
			case 2:
				e[i]=new Battle(rand_row,rand_col);
				break;
			case 3:
				e[i]=new Treasure(rand_row,rand_col);
				break;
			}
		}
		return e;
	}
}
