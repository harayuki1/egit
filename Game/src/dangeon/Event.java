package dangeon;

public class Event {
	private int row;
	private int col;
	private String name;
	public Event(int row,int col, String name) {
		this.row=row;
		this.col=col;
		this.name=name;
	}
	public void action() {
		
	}
	public int get_row() {
		return row;
	}
	public int get_col() {
		return col;
	}
	
}
