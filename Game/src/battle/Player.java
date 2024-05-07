package battle;

//プレイヤーのステータス
public class Player {
	private String name;//名前
	private int Lv = 1;//現在レベル
	private int exp = 0;//現在経験値
	private Mantra now_mantra;
	private int HP; //体力
	private int MP; //コスト
	private int attack; //攻撃力
	private int magic; //魔力
	private int guard; //耐久力
	private int speed; //回避率
	private int luck; //運
	private String skill1;
	private String skill2;
	private String skill3;
	private String skill4;
	private String skill5;
	private String skill6;
	private String skill7;
	private String skill8;
	private boolean hunting=false;//戦闘後の経験値処理で必要

	public Player(String name, int HP, int MP, int attack, int magic, int guard, int speed, int luck, String skill1) {
		this.name = name;
		this.HP = HP;
		this.MP = MP;
		this.attack = attack;
		this.magic = magic;
		this.guard = guard;
		this.speed = speed;
		this.luck = luck;
		this.skill1 = skill1;
	}

	public static void action(String name, Enemy enemy) {
		if (name == "") {

		}
	}
	
	//セッターゲッター

	public String get_name() {
		return name;
	}

	public int get_Lv() {
		return Lv;
	}

	public void set_Lv(int Lv) {
		this.Lv = Lv;
	}

	public int get_exp() {
		return exp;
	}
	public void set_exp(int exp) {
		this.exp = exp;
	}
	public Mantra get_now_mantra() {
		return now_mantra;
	}
	public void set_now_mantra(Mantra now_mantra) {
		this.now_mantra = now_mantra;
	}

	public int get_HP() {
		return HP;
	}
	public void set_HP(int HP) {
		this.HP = HP;
	}

	public int get_MP() {
		return MP;
	}
	public void set_MP(int MP) {
		this.MP = MP;
	}

	public int get_attack() {
		return attack;
	}
	public void set_attack(int attack) {
		this.attack = attack;
	}

	public int get_magic() {
		return magic;
	}
	public void set_magic(int magic) {
		this.magic = magic;
	}

	public int get_guard() {
		return guard;
	}
	public void set_guard(int guard) {
		this.guard = guard;
	}

	public int get_speed() {
		return speed;
	}
	public void set_speed(int speed) {
		this.speed = speed;
	}

	public int get_luck() {
		return luck;
	}
	public void set_luck(int luck) {
		this.luck = luck;
	}

	public String get_skill1() {
		return skill1;
	}
	public void set_skill1(String skill1) {
		this.skill1 = skill1;
	}

	public String get_skill2() {
		return skill2;
	}
	public void set_skill2(String skill2) {
		this.skill2 = skill2;
	}


	public String get_skill3() {
		return skill3;
	}
	public void set_skill3(String skill3) {
		this.skill3 = skill3;
	}


	public String get_skill4() {
		return skill4;
	}
	public void set_skill4(String skill4) {
		this.skill4 = skill4;
	}

	public String get_skill5() {
		return skill5;
	}
	public void set_skill5(String skill5) {
		this.skill5 = skill5;
	}

	public String get_skill6() {
		return skill6;
	}
	public void set_skill6(String skill6) {
		this.skill6 = skill6;
	}


	public String get_skill7() {
		return skill7;
	}
	public void set_skill7(String skill7) {
		this.skill7 = skill7;
	}


	public String get_skill8() {
		return skill8;
	}
	public void set_skill8(String skill8) {
		this.skill8 = skill8;
	}
	public boolean get_hunting() {
		return hunting;
	}
	public void set_hunting(boolean hunting) {
		this.hunting=hunting;
	}


}
