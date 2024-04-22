package dangeon;

public class Meiro {
	private int start_row;//行
	private int start_col;//列
	private int goal_row;
	private int goal_col;
	//private String[][] dangeon; 
	private static Event[] event= {new Treasure(0,0),new Event(0,0,"")};
	private static Panel[][] dangeon = {
			{ new Panel_wall_3( "wall_3_nodown"), new Panel_wall_2("wall_2_upleft"), new Panel_wall_2("wall_2_updown"), new Panel_wall_2("wall_2_updown"), new Panel_wall_2("wall_2_upright") }, 
			{ new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_upleft"), new Panel_wall_2("wall_2_upright"), new Panel_wall_2("wall_2_leftright")}, 
			{ new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright") },
			{ new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright"), new Panel_wall_2("wall_2_leftright") }, 
			{ new Panel_wall_2("wall_2_downleft"), new Panel_wall_2("wall_2_downright"), new Panel_wall_3("wall_3_noup"),new Panel_wall_2("wall_2_downleft"), new Panel_wall_2("wall_2_downright") } };

	

	public Meiro() {
		this(dangeon, 4, 2, 0, 0,event);
	}
	public Meiro(Event[] event) {
		this(dangeon, 4, 2, 0, 0,event);
	}

	public Meiro(Panel[][] dangeon, int start_row, int start_col, int goal_row, int goal_col,Event[] event) {
		this.dangeon = dangeon;
		this.start_row = start_row;
		this.start_col = start_col;
		this.goal_row = goal_row;
		this.goal_col = goal_col;
		this.event=event;
	}

	public Panel[][] get_dangeon() {
		return dangeon;
	}

	public int get_start_row() {
		return start_row;
	}

	public int get_start_col() {
		return start_col;
	}

	public int get_goal_row() {
		return goal_row;
	}

	public int get_goal_col() {
		return goal_col;
	}
	public Event[] get_event() {
		return event;
	}
	public void set_event(Event[] event) {
		this.event=event;
	}
}
