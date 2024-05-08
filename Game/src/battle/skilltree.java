package battle;

public class skilltree {
	private String name;
	private int exp=0;//現在経験値
	private int max_exp;//目標経験値　ここまで達することでスキルが使える。
	private Player player;//装備しているプレイヤー
	private String skill1;
	private String skill2;
	private String skill3;
	private String skill4;
	public skilltree(String name,int max_exp,Player player,String skill1,String skill2,String skill3,String skill4) {
		this.name=name;
		this.max_exp=max_exp;
		this.player=player;
		this.skill1=skill1;
		this.skill2=skill2;
		this.skill3=skill3;
		this.skill4=skill4;
	}
	public String get_name() {
		return name;
	}
	public int get_exp() {
		return exp;
	}
	public void set_exp(int exp) {
		this.exp=exp;
	}
	public int get_max_exp() {
		return max_exp;
	}
	public Player get_player() {
		return player;
	}
	public String get_skill1(){
		return skill1;
	}
	public String get_skill2(){
		return skill2;
	}
	public String get_skill3(){
		return skill3;
	}
	public String get_skill4(){
		return skill4;
	}
}
