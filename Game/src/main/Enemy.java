package main;

public class Enemy {
	public String name;//名前
	public int HP; //体力
	public int attack; //攻撃力
	public int magic; //魔力
	public int guard; //耐久力
	public int speed; //回避率
	public String action1;
	public String action2;
	public String action3;
	public String action4;
	public int attack_per;
	public int action_per;
	public int escape_per;

	
	
	public Enemy(String name,int HP,int attack,int magic,int guard,int speed,String action1,String action2,String action3,String action4,int attack_per,int action_per,int escape_per) {
		this.name=name;
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
}
