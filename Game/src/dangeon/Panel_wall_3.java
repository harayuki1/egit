package dangeon;

public class Panel_wall_3 extends Panel{
	public Panel_wall_3(String t) {
		super(t);
	}

	public static void check_wall_3(String wall) {
		if (wall == "wall_3_noup") {
			left=false;
			right=false;
			down = false;
		} else if (wall == "wall_3_noleft") {
			up=false;
			right=false;
			down = false;
		} else if (wall == "wall_3_noright") {
			up = false;
			left = false;
			down = false;

		} else if (wall == "wall_3_down") {
			up = false;
			left=false;
			right = false;
		}

	}
}
