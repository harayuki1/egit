package dangeon;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class LinePanel extends JPanel {

	private String name;
	private Panel[][] dangeon;
	private int now_x = 0;
	private int now_y = 0;
	private int goal_x;
	private int goal_y;
	public static int size=50;
	
	public LinePanel(Panel[][] dangeon,int goal_x,int goal_y) {
		this.dangeon = dangeon;
		this.goal_x=goal_x;
		this.goal_y=goal_y;
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		// 線の描画j
		int x1 = 10;
		int y1 = 10;
		int x2 = 10;
		int y2 = 20;
		int t = size;
		for (int i = 0; i < dangeon.length; i++) {
			for (int j = 0; j < dangeon[i].length; j++) {
				int x = j;
				int y = i;
				String name = dangeon[i][j].getname();
				if (name == "wall_1_up") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_1_down") {
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_1_right") {
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_1_left") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = x * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_2_updown") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_2_leftright") {
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);

				} else if (name == "wall_2_upleft") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);

				} else if (name == "wall_2_upright") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_2_downleft") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_2_downright") {
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_3_nodown") {
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_3_noup") {
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_3_noleft") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_3_noright") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_4") {
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + 10;
					y1 = y * t + 10;
					x2 = x * t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
					x1 = x * t + t + 10;
					y1 = y * t + 10;
					x2 = x * t + t + 10;
					y2 = y * t + t + 10;
					g2d.drawLine(x1, y1, x2, y2);
				} else if (name == "wall_cross") {

				}

			}
			
		}
		g.setColor(Color.YELLOW);
		g.fillRect(0*LinePanel.size+(LinePanel.size/2)+5, 9*LinePanel.size+(LinePanel.size/2)+5, 10, 10);
		g.fillRect(4*LinePanel.size+(LinePanel.size/2)+5, 5*LinePanel.size+(LinePanel.size/2)+5, 10, 10);
		g.setColor(Color.BLUE);
		g.fillRect(goal_x*LinePanel.size+(LinePanel.size/2)+5, goal_y*LinePanel.size+(LinePanel.size/2)+5, 10, 10);

		//g2d.drawLine(x1, y1, x2, y2); // drawLine メソッドを使用して線を描画
	}
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.RED);
		g.fillRect(now_x, now_y, 10, 10); // 四角形を描画
	}

	public int getNowX() {
		return now_x;
	}
	public void setNowX(int now_x) {
		this.now_x=now_x;
	}
	public int getNowY() {
		return now_y;
	}
	public void setNowY(int now_y) {
		this.now_y=now_y;
	}
	/*
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			JFrame frame = new JFrame("Line Example");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(1020, 1020);
			frame.add(new LinePanel("wall_1_right", 0, 0));
			frame.setVisible(true);
		});
	}
	*/
}
