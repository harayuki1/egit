package battle;

import lib.Input;

//経験値、レベル関係の処理
//敵のレベルをもとに得られる経験値を処理
public class level {

	static void Level(Player[] player, Enemy enemy) {
		//level*3 expの値
		for (int i = 0; i < player.length; i++) {

			player[i].set_exp((int) (player[i].get_exp() + (enemy.get_Lv() * 3)));
			//同レべを8体倒すと上がる計算
			if (player[i].get_exp() >= (player[i].get_Lv() * 24)) {
				player[i].set_exp(player[i].get_exp() - (player[i].get_Lv() * 24));
				player[i].set_Lv(player[i].get_Lv() + 1);

				//プレイヤーにどの値を上げるかを選ばせる　計３回
				System.out.println(player[i].get_name() + "がレベルアップ");
				int count = 0;
				while (true) {

					int select = Input
							.getInt("どれを上げますか　1.攻(現在:" + player[i].get_attack() + ")　2.魔(現在:" + player[i].get_magic()
									+ ")　3.耐(現在:" + player[i].get_guard() + ")　4.速(現在:" + player[i].get_speed() + ")　5.運(現在:"
									+ player[i].get_luck() + ")");
					switch (select) {
					case 1:
						if (player[i].get_attack() >= 99) {

						} else {
							player[i].set_attack(player[i].get_attack() + 1);
							count++;
						}

						break;
					case 2:
						if (player[i].get_magic() >= 99) {

						} else {
							player[i].set_magic(player[i].get_magic() + 1);
							count++;
						}

						break;
					case 3:
						if (player[i].get_guard() >= 99) {

						} else {
							player[i].set_guard(player[i].get_guard() + 1);
							count++;
						}

						break;
					case 4:
						if (player[i].get_speed() >= 99) {

						} else {
							player[i].set_speed(player[i].get_speed() + 1);
							count++;
						}

						break;
					case 5:
						if (player[i].get_luck() >= 99) {

						} else {
							player[i].set_luck(player[i].get_luck() + 1);
							count++;
						}

						break;
					}
					if (count == 3) {
						break;
					}

				}

			}
		}

	}
}
