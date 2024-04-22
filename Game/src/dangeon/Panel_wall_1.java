package dangeon;

public class Panel_wall_1 extends Panel {
	public Panel_wall_1(String t) {
		super(t);
	}
	public static void check_wall_1(String wall){
		if(wall=="wall_1_up") {
			up=false;
		}
		else if(wall=="wall_1_down") {
			down=false;
		}
		else if(wall=="wall_1_left") {
			left=false;
		}
		else if(wall=="wall_1_right") {
			right=false;
		}
	}
}
