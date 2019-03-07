import java.awt.Color; // graphics library

import uwcse.graphics.*; // uw graphics library

/**
 * A fish in a graphics window
 */

// creates public class named Fish
public class Fish {

	// The graphics window the fish belongs to
	private GWindow window;
	// The location of the fish
	// the x-coordinate of the fish
	private int x;
	// the y-coordinate of the fish
	private int y;
	// Scale of the drawing of the fish
	private double scale;
	// Color of the fish
	private Color fishColor;

	/**
	 * Draws a Fish in a graphics window
	 * 
	 * @param x
	 *            the x coordinate of the location of the fish
	 * @param y
	 *            the y coordinate of the location of the fish
	 * @param scale
	 *            the scale of the drawing of the fish
	 * @param window
	 *            the graphics window the fish belongs to
	 */
	
	// public Fish constructor
	public Fish(int x, int y, double scale, GWindow window) {
		
		// Initialize the instance fields
		this.x = x;
		this.y = y;
		this.scale = scale;
		this.window = window;
		
		// generate random colors for fish
		// the red integer
		int r = (int)(Math.random() * 256);
		// the green integer
		int g = (int)(Math.random() * 256);
		// the blue integer
		int b = (int)(Math.random() * 256);
		// defines the boat color
		fishColor = new Color(r, g, b);

		// Draw the fish
		this.draw();
	}

	/**
	 * Draws this fish
	 */
	
	// private draw method
	private void draw() {
		
		// defines the pxscale
		int pxscale = 20;
		// defines the height of the fish
		int height = (int)(this.scale * pxscale);
		// defines the length of the fish
		int length = (int)(2.5 * height);
		// defines the radius of the eye of the fish
		int eyeRadius = length / 10;
		
		// defines the body of the fish
		Oval body = new Oval(this.x, this.y, length,
				height, fishColor, true);
		
		// adds the body to window
		this.window.add(body);
		
		// makes the fish facing right
		if (Math.random() < 0.5) {
		// initialize the coordinates for every point of the object
		int x1 = this.x - length / 4;
		int y1 = this.y;
		int x2 = x1;
		int y2 = this.y + height;
		int x3 = this.x + length / 5;
		int y3 = this.y + height / 2;
		int x4 = this.x + length * 3 / 4;
		int y4 = this.y + height * 3 / 16;
		int x5 = this.x + length * 3 / 4;
		int y5 = this.y + height * 5 / 8;
		int x6 = this.x + length;
		int y6 = y3;
		int x7 = x6;
		int y7 = y2;
		int x8 = this.x + length * 2 / 3;
		int y8 = this.y + height / 2;
		int x9 = this.x + length * 4 / 9;
		int y9 = this.y + height / 4;
		int x10 = x9;
		int y10 = this.y + height * 3 / 4;
		int x11 = x9 - length / 8;
		int y11 = this.y - height / 3 ;
		int x12 = x9;
		int y12 = this.y + height / 6;
		int x13 = x9 + length / 4;
		int y13 = y12;
		int x14 = x11;
		int y14 = this.y + height * 4 / 3;
		int x15 = x12;
		int y15 = this.y + height * 5 / 6;
		int x16 = x13;
		int y16 = y15;
		
		// defines the tail
		Triangle tail = new Triangle(x1, y1, x2, y2, 
				x3,y3, fishColor, true);
		// defines the eye
		Oval eye = new Oval(x4, y4, eyeRadius, eyeRadius, 
				Color.BLACK, true);
		// defines the mouth
		Triangle mouth = new Triangle(x5, y5, x6, 
				y6, x7, y7, Color.BLUE, true);
		// defines the fin on the top of the fish
		Triangle fin1 = new Triangle(x8, y8, x9, y9, x10, y10,
				Color.BLACK,false);
		// defines the fin on the bottom of the fish
		Triangle fin2 = new Triangle(x11, y11, x12, y12, x13, y13,
				fishColor,true);
		// defines the fin on the side of the fish
		Triangle fin3 = new Triangle(x14, y14, x15, y15, x16, y16,
				fishColor,true);
		
		// adds the tail to window
		this.window.add(tail);
		// adds the eye to window
		this.window.add(eye);
		// adds the mouth to window
		this.window.add(mouth);
		//adds the fin on the top of the fish to window
		this.window.add(fin1);
		//adds the fin on the fin on the bottom of the fish
		this.window.add(fin2);
		//adds the fin on the fin on the side of the fish
		this.window.add(fin3);
		}
		
		// makes the fish facing left 
		else{
			// initialize the coordinates for every point of the object
			int x1 = this.x + length * 5 / 4;
			int y1 = this.y;
			int x2 = x1;
			int y2 = this.y + height;
			int x3 = this.x + length * 4 / 5;
			int y3 = this.y + height / 2;
			int x4 = this.x + length / 5;
			int y4 = this.y + height * 3 / 16;
			int x5 = this.x + length / 4;
			int y5 = this.y + height * 5 / 8;
			int x6 = this.x;
			int y6 = y3;
			int x7 = x6;
			int y7 = y2;
			int x8 = this.x + length / 3;
			int y8 = this.y + height / 2;
			int x9 = this.x + length * 5 / 9;
			int y9 = this.y + height / 4;
			int x10 = x9;
			int y10 = this.y + height * 3 / 4;
			int x11 = x9 + length / 8;
			int y11 = this.y - height / 3 ;
			int x12 = x9;
			int y12 = this.y + height / 6;
			int x13 = x9 - length / 4;
			int y13 = y12;
			int x14 = x11;
			int y14 = this.y + height * 4 / 3;
			int x15 = x12;
			int y15 = this.y + height * 5 / 6;
			int x16 = x13;
			int y16 = y15;
			
			// defines the tail
			Triangle tail = new Triangle(x1, y1, x2, y2, 
					x3,y3, fishColor, true);
			// defines the eye
			Oval eye = new Oval(x4, y4, eyeRadius, eyeRadius, 
					Color.BLACK, true);
			// defines the mouth
			Triangle mouth = new Triangle(x5, y5, x6, 
					y6, x7, y7, Color.BLUE, true);
			// defines the fin on the top
			Triangle fin1 = new Triangle(x8, y8, x9, y9, x10, y10,
					Color.BLACK,false);
			// defines the fin on the bottom
			Triangle fin2 = new Triangle(x11, y11, x12, y12, x13, y13,
					fishColor,true);
			// defines the fin on the side
			Triangle fin3 = new Triangle(x14, y14, x15, y15, x16, y16,
					fishColor,true);
			
			// adds the tail to window
			this.window.add(tail);
			// adds the eye to window
			this.window.add(eye);
			// adds the mouth to window
			this.window.add(mouth);
			//adds the fin on the top of the fish to window
			this.window.add(fin1);
			//adds the fin on the fin on the bottom of the fish
			this.window.add(fin2);
			//adds the fin on the fin on the side of the fish
			this.window.add(fin3);
		}
	}
}