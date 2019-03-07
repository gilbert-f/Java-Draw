import uwcse.graphics.*;
import java.awt.Color;
public class Moon{
	private GWindow window;
	private int x, x2, y, radiusCircle, diameterCircle;
	private double scale;
	private Color moonColor;
	public Oval moonCover, moon;
	
	public Moon(int x, int y, double scale, GWindow window){
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.window = window;
		
		// draw the moon
		this.draw();
	}
	private void draw(){
		int pxscale = 25;
		radiusCircle = (int)(this.scale * pxscale);
		diameterCircle = 2 * radiusCircle;
		x2 = (int) (this.x + (radiusCircle / 2));
		moonColor = Color.YELLOW;
		
		moonCover = new Oval(x2, this.y, diameterCircle,
				diameterCircle, Color.BLACK, true); 
		moon = new Oval(this.x, this.y, diameterCircle,
				diameterCircle, moonColor, true);

		this.window.add(moon);
		this.window.add(moonCover);
	}
}
