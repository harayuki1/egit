package dangeon;

public class Panel_wall_2 extends Panel {
	public Panel_wall_2(String t) {
		super(t);
	}

	public static void check_wall_2(String wall) {
		if (wall == "wall_2_updown") {
			up = false;
			down = false;
		} else if (wall == "wall_2_leftright") {
			left = false;
			right = false;
		} else if (wall == "wall_2_upleft") {
			up = false;
			left = false;

		} else if (wall == "wall_2_upright") {
			up = false;
			right = false;
		} else if (wall == "wall_2_downleft") {
			down = false;
			left = false;

		} else if (wall == "wall_2_downright") {
			down = false;
			right = false;
		}

	}
}
