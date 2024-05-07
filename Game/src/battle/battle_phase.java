package battle;

import lib.Input;

public class battle_phase {

	private static int phase = 1;
	public static int encount = 3;
	private static boolean escape = false;
	private static int playercount;
	private static int enemycount;
	//別のファイルに移動の可能性あり　キャラクターのステータス
	public static Enemy enemy = new Enemy("",1, 10, 1, 1, 1, 1, "", "", "", "", 70, 20, 10);

	public static void battle(Player[] player) {//戦闘処理

		playercount = 3;
		//エネミーの数はいったん一人、のちに数が増えるのでその処理をしなければ。。。
		enemycount = 1;
		boolean win=false;
		//encount関連の処理
		while(true) {
			
			for (int i = 0; i < encount; i++) {
				myphase(player[i], enemy);
				if (escape == true) {
					win=true;
					break;
				}
			}
			//勝利
			if (enemycount == 0) {
				System.out.println("勝利");
				level.Level(player,enemy);
				//Mantra_action.mantra_exp(player, enemy);
				win=true;
				return;
			}
			//encount関連の処理
			for (int i = 0; i < encount; i++) {
				if (escape == true) {
					break;
				}
				//攻撃する対象をランダムで決定

				enemyphase(enemy, player[(int) (Math.random() * 3)]);//変更予定
			}
			//敗北
			if (playercount == 0) {
				System.out.println("負け");
				win=true;
				return;
			}
			
			if(win==true) {
				break;
			}
		}
		
	}

	//プレイヤーのアクション
	private static void myphase(Player player, Enemy enemy) {
		System.out.println("1.攻撃　2.アクション　3.アイテム　4.逃げる");
		int command = Input.getInt(player.get_name() + "が何をするか選んでください");
		if (command == 1) { //攻撃
			int attack;
			//回避は60～90%であたることにする。
			int dice = (int) (Math.random() * 100 + 1);
			if (dice < 90 - (int) (enemy.get_speed() * 0.01 * 30)) {
				int dice2 = (int) (Math.random() * 100 + 1);
				if (dice2 > 100 - (int) (player.get_luck() * 0.01 * 30)) {//クリティカル処理
					attack = (int) (player.get_attack() * 1.2);
				} else {
					attack = player.get_attack();
				}
				enemy.set_HP((int)(enemy.get_HP()-(attack * (1 - 0.003 * enemy.get_guard()))));
				System.out.println(attack + "のダメージ");
			} else {
				System.out.println("はずれた");
			}

			System.out.println(enemy.get_HP());
		} else if (command == 2) {//アクション"
			int command_action = Input.getInt("何をするか選んでください　1." + player.get_skill1() + "　2." + player.get_skill2() + "　3."
					+ player.get_skill3() + "　4." + player.get_skill4() + "　5." + player.get_skill5() + "6." + player.get_skill6() + "　7."
					+ player.get_skill7() + "　8." + player.get_skill8());
			switch (command_action) {
			case 1:
				player.action(player.get_skill1(), enemy);
				break;
			case 2:
				player.action(player.get_skill2(), enemy);
				break;
			case 3:
				player.action(player.get_skill3(), enemy);
				break;
			case 4:
				player.action(player.get_skill4(), enemy);
				break;
			case 5:
				player.action(player.get_skill5(), enemy);
				break;
			case 6:
				player.action(player.get_skill6(), enemy);
				break;
			case 7:
				player.action(player.get_skill7(), enemy);
				break;
			case 8:
				player.action(player.get_skill8(), enemy);
				break;

			}
		} else if (command == 3) {//アイテム

		} else if (command == 4) {//逃げる
			if ((int) (Math.random() * 2) == 0) {
				System.out.println("逃げた");
				escape = true;
			} else {
				System.out.println("逃げれなかった");
			}
		}
	}

	//敵のアクション
	private static void enemyphase(Enemy enemy, Player player) {
		int dice_command = (int) (Math.random() * 100 + 1);
		int command = 1;
		if (dice_command <= enemy.get_attack_per()) {
			command = 1;
		} else if (dice_command <= enemy.get_attack_per() + enemy.get_action_per()) {
			command = 2;
		} else {
			command = 3;
		}
		if (command == 1) {

			//回避は60～90%であたることにする。
			int dice = (int) (Math.random() * 100 + 1);
			if (dice < 90 - (int) (player.get_speed() * 0.01 * 30)) {
				player.set_HP((int)(player.get_HP() - (enemy.get_attack() * (1 - 0.003 * player.get_guard()))));
				System.out.println(enemy.get_attack() + "のダメージ");
			} else {
				System.out.println("敵の攻撃は外れた");
			}
		} else if (command == 2) {//アクション

		} else if (command == 3) {//逃げる
			if ((int) (Math.random() * 2) == 0) {
				System.out.println("逃げられた");
			} else {
				System.out.println("逃げれなかった");
			}
		}

	}

}
