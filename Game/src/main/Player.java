package main;

public class Player {
	public String name;//名前
	public int HP; //体力
	public int MP; //コスト
	public int attack; //攻撃力
	public int magic; //魔力
	public int guard; //耐久力
	public int speed; //回避率
	public int luck; //運
	public String skill1;
	public String skill2;
	public String skill3;
	public String skill4;
	public String skill5;
	public String skill6;
	public String skill7;
	public String skill8;
	public Player(String name,int HP,int MP,int attack,int magic,int guard,int speed,int luck,String skill1) {
		this.name=name;
		this.HP=HP;
		this.MP=MP;
		this.attack=attack;
		this.magic=magic;
		this.guard=guard;
		this.speed=speed;
		this.luck=luck;
		this.skill1=skill1;
	}
	public static void action(String name,Enemy enemy) {
		if(name=="") {
			
		}
	}
}
