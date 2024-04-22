package dangeon;

public class Panel {
	private String name;
	public static boolean up=true;
	public static boolean down=true;
	public static boolean left=true;
	public static boolean right=true;
	public Panel() {
		this("");
	}
	public Panel(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
}
