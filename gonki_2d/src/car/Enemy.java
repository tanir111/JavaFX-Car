package car;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.ImageIcon;

public class Enemy {
	
	int x;
	int y;
	int v;
	Image img = new ImageIcon("res/rival.png").getImage();
	Road road;
	
	public Rectangle getRect(){
		return new Rectangle(x, y, 150, 63);
		
	}
	
	
		
	
	
	public Enemy(int x, int y, int v, Road road){
		this.x = x;
		this.y = y;
		this.v = v;
		this.road = road;
	}
	
	public void move(){
		x = x - road.p.v + v;
	}

}
