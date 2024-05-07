package dangeon;

public class Panel_wall_4 extends Panel{
	public Panel_wall_4(String t) {
		super(t);
	}

	public static void check_wall_4(String wall) {
		if(wall=="wall_4") {
			up=false;
			left=false;
			right=false;
			down = false;
		}

	}
}
