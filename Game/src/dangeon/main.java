package dangeon;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import battle.battle_phase;
import lib.Input;

public class main {

	//private static JLabel label;
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Meiro dangeon = new Meiro();
		/*
		Map.visualize(dangeon.get_dangeon(), dangeon.get_start_row(), dangeon.get_start_col(), dangeon.get_goal_row(),
				dangeon.get_goal_col());
		*/
		LinePanel field=new LinePanel(dangeon.get_dangeon(),dangeon.get_goal_col(),dangeon.get_goal_row());
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Line Example");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//System.out.println((dangeon.get_dangeon().length*50+20));
			
			frame.setSize((dangeon.get_dangeon()[0].length+1)*LinePanel.size+20, (dangeon.get_dangeon().length+1)*LinePanel.size+20);
			//System.out.println(dangeon.get_dangeon()[0][0].getname());
			//繰り返し
			
			//label = new JLabel("Hello, World!");
			
			frame.add(field);
			
			
			frame.setVisible(true);
		});
		//dangeon.set_event(setting(dangeon));
		Event[] e={new Treasure(9,0),new Treasure(5,4)};
		dangeon.set_event(e);
		int[] now = { dangeon.get_start_row(), dangeon.get_start_col() };
		//field.setNowX(dangeon.get_start_col()*LinePanel.size+(LinePanel.size/2)-5);
		field.setNowX(dangeon.get_start_col()*LinePanel.size+(LinePanel.size/2)+5);
		field.setNowY(dangeon.get_start_row()*LinePanel.size+(LinePanel.size/2)+5);
		
		while (true) {
			//field.repaint();
			//移動
			now = control(dangeon.get_dangeon(), now,field);
			field.repaint();
			//イベント処理
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
			//バトルの処理
			int dice = (int) (Math.random() * 100 + 1);
			if(dice<=20) {
				battle_phase bt = new battle_phase();
				bt.battle(Battle.player);
				//label.setText("");
			}
			
		}
	}

	public static int[] control(Panel[][] dangeon, int[] start,LinePanel field) {
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
				field.setNowY(field.getNowY()-LinePanel.size);
			} else {
				System.out.println("いけません");

			}
			break;
		case "s":
			if (Panel.down == true) {
				now_row++;
				field.setNowY(field.getNowY()+LinePanel.size);
			} else {
				System.out.println("いけません");

			}
			break;
		case "a":
			if (Panel.left == true) {
				now_col--;
				field.setNowX(field.getNowX()-LinePanel.size);
			} else {
				System.out.println("いけません");

			}
			break;
		case "d":
			if (Panel.right == true) {
				now_col++;
				field.setNowX(field.getNowX()+LinePanel.size);
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

	//イベントをセットするもの　後にランダム予定
	public static Event[] setting(Meiro dangeon) {
		Event[] e = new Event[3];
		for (int i = 0; i < e.length; i++) {
			int rand_row = (int) (Math.random() * dangeon.get_dangeon().length);
			int rand_col = (int) (Math.random() * dangeon.get_dangeon()[0].length);
			int dice = (int) (Math.random() * 3 + 1);

			switch (dice) {
			case 1:
				e[i] = new Treasure(rand_row, rand_col);
				break;
			case 2:
				e[i] = new Battle(rand_row, rand_col);
				break;
			case 3:
				e[i] = new Treasure(rand_row, rand_col);
				break;
			}
		}
		return e;
	}
	

}
