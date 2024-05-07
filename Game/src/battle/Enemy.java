package battle;

//敵のステータス
public class Enemy {
	private String name;//名前
	private int Lv;
	private int HP; //体力
	private int attack; //攻撃力
	private int magic; //魔力
	private int guard; //耐久力
	private int speed; //回避率
	private String action1;
	private String action2;
	private String action3;
	private String action4;
	private int attack_per;
	private int action_per;
	private int escape_per;

	
	
	public Enemy(String name,int Lv,int HP,int attack,int magic,int guard,int speed,String action1,String action2,String action3,String action4,int attack_per,int action_per,int escape_per) {
		this.name=name;
		this.Lv=Lv;
		this.HP=HP;
		this.attack=attack;
		this.magic=magic;
		this.guard=guard;
		this.speed=speed;
		this.action1=action1;
		this.action2=action2;
		this.action3=action3;
		this.action4=action4;
		this.attack_per=attack_per;
		this.action_per=action_per;
		this.escape_per=escape_per;
	}
	public String get_name() {
		return name;
	}
	public int get_Lv() {
		return Lv;
	}
	public int get_HP() {
		return HP;
	}
	public void set_HP(int HP) {
		this.HP=HP;
	}
	public int get_attack() {
		return attack;
	}
	public int get_magic() {
		return magic;
	}
	public int get_guard() {
		return guard;
	}
	public int get_speed() {
		return speed;
	}
	public String get_action1() {
		return action1;
	}
	public String get_action2() {
		return action2;
	}
	public String get_action3() {
		return action3;
	}
	public String get_action4() {
		return action4;
	}
	public int get_attack_per() {
		return attack_per;
	}
	public int get_action_per() {
		return action_per;
	}
	public int get_escape_per() {
		return escape_per;
	}
}
