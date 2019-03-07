import java.awt.Color; // graphics library
import uwcse.graphics.*; // uw graphics library

/**
 * A sailboat in a graphics window
 */

// Create a SailBoat class
public class SailBoat {

	// The graphics window the boat belongs to
	private GWindow window;

	// The location of the boat
	// The x-coordinate of the boat
	private int x;
	// The y-coordinate of the boat
	private int y;
	// Scale of the drawing of the boat
	private double scale;
	// Color of the boat
	private Color boatColor;

	/**
	 * Draws a sailboat in a graphics window
	 * 
	 * @param x
	 *            the x coordinate of the location of the boat
	 * @param y
	 *            the y coordinate of the location of the boat
	 * @param window
	 *            the graphics window where the boat is displayed
	 * @param window
	 *            the graphics window the boat belongs to
	 */
	// SailBoat constructor
	public SailBoat(int x, int y, double scale, GWindow window) {
		// Initialize the instance fields
		// x-coordinate
		this.x = x;
		// y-coordinate
		this.y = y;
		// scale
		this.scale = scale;
		// window
		this.window = window;
		
		// generate random colors for fish
				// the red integer
				int r = (int)(Math.random() * 256);
				// the green integer
				int g = (int)(Math.random() * 256);
				// the blue integer
				int b = (int)(Math.random() * 256);
				// defines the boat color
				boatColor = new Color(r, g, b);

		// Draw the boat
		this.draw();
	}

	/**
	 * Draws this sailboat
	 */
	// private draw method
	private void draw() {
		
		// initialize the value of pxscale
		int pxscale = 25;
		// the size of the sail
		int sailSize = (int)(this.scale * pxscale);
		// the pole width
		int poleWidth = sailSize / 12;
		// the pole height
		int poleHeight = sailSize * 12 / 10;
		// the length of the boat
		int boatLength = sailSize * 22 / 10;
		// the height of the boat
		int boatHeight = sailSize / 4;
		
		// draws the boat facing left
		if (Math.random() < 0.5) {
		
		// initialize the coordinates for every points on the objects
		int x1 = this.x;
		int y1 = this.y;
		int x2 = x1 - sailSize;
		int y2 = y1 + sailSize;
		int x3 = x1;
		int y3 = y2;
		int x4 = x1;
		int y4 = y1;
		int x5 = x1 + poleWidth;
		int y5 = y1;
		int x6 = x5 + sailSize / 3;
		int y6 = y5 + sailSize / 5;
		int x7 = x5;
		int y7 = y6;
		int x8 = x7;
		int y8 = y7;
		int x9 = x7;
		int y9 = y3;
		int x10 = x9 + sailSize * 3 / 4;
		int y10 = y9;
		int x11 = x2 - sailSize / 5;
		int y11 = y1 + poleHeight;
		int x12 = x9 + boatLength / 14;
		int y12 = y11 - boatHeight * 2 / 3;
		int x13 = x11;
		int y13 = y12 + boatHeight/ 3 * 2;
		int x14 = x11 - boatLength / 9;
		int y14 = y11;
		int x15 = x11;
		int y15 = y11 + boatHeight;
		int x16 = x11 + boatLength - 1;
		int y16 = y11;
		int x17 = x11 + boatLength / 9 + boatLength - 1;
		int y17 = y16;
		int x18 = x11 + boatLength - 1;
		int y18 = y15;
		
		// define the first sail
		Triangle sail1 = new Triangle(x1, y1, x2, y2, x3, y3,
				Color.WHITE, true);
		// define the pole
		Rectangle pole = new Rectangle(x4, y4, poleWidth,
				poleHeight, Color.BLACK, true);
		// define the second sail
		Triangle sail2 = new Triangle(x5, y5, x6, y6, x7, y7,
				Color.RED, true);
		// define the flag
		Triangle flag = new Triangle(x8, y8, x9, y9, x10, y10,
				Color.YELLOW, true);
		// define the boat
		Rectangle boat1 = new Rectangle(x11, y11, boatLength,
				boatHeight, boatColor, true);
		Rectangle boat2 = new Rectangle(x12, y12, boatLength / 4,
				boatHeight / 2 * 3, boatColor, true);
		Triangle boat3 = new Triangle(x13, y13, x14, y14, x15, 
				y15, boatColor, true);
		Triangle boat4 = new Triangle(x16, y16, x17, y17, x18, 
				y18, boatColor, true);
		
		// adds the first sail to window
		this.window.add(sail1);
		// adds the pole to window
		this.window.add(pole);
		// adds the second sail to window
		this.window.add(sail2);
		// adds the flag to window
		this.window.add(flag);
		// adds the boat to window
		this.window.add(boat1);
		this.window.add(boat2);
		this.window.add(boat3);
		this.window.add(boat4);
		}
		
		// draws the boat facing right
		else{
			// initialize the coordinates for every points on the objects
			int x1 = this.x;
			int y1 = this.y;
			int x19 = this.x + poleWidth;
			int y19 = this.y;
			int x2 = x1 + poleWidth + sailSize;
			int y2 = y1 + sailSize;
			int x3 = x1;
			int y3 = y2;
			int x4 = x1;
			int y4 = y1;
			int x5 = x1;
			int y5 = y1;
			int x6 = x5 - sailSize / 3;
			int y6 = y5 + sailSize / 5;
			int x7 = x5;
			int y7 = y6;
			int x8 = x7;
			int y8 = y7;
			int x9 = x7;
			int y9 = y3;
			int x10 = x9 - sailSize * 3 / 4;
			int y10 = y9;
			int x11 = x10 - sailSize /5;
			int y11 = y1 + poleHeight;
			int x12 = x10 + boatLength /14;
			int y12 = y11 - boatHeight * 2 / 3;
			int x13 = x11;
			int y13 = y12 + boatHeight / 3 * 2;
			int x14 = x11 - boatLength / 9;
			int y14 = y11;
			int x15 = x11;
			int y15 = y11 + boatHeight;
			int x16 = x11 + boatLength - 1;
			int y16 = y11;
			int x17 = x11 + boatLength / 9 + boatLength - 1;
			int y17 = y16;
			int x18 = x11 + boatLength - 1;
			int y18 = y15;
			
			// define the first sail
			Triangle sail1 = new Triangle(x19, y19, x2, y2, x3, y3,
					Color.WHITE, true);
			// define the pole
			Rectangle pole = new Rectangle(x4, y4, poleWidth,
					poleHeight, Color.BLACK, true);
			// define the second sail
			Triangle sail2 = new Triangle(x5, y5, x6, y6, x7, y7,
					Color.RED, true);
			// define the flag
			Triangle flag = new Triangle(x8, y8, x9, y9, x10, y10,
					Color.YELLOW, true);
			// define the boat
			Rectangle boat1 = new Rectangle(x11, y11, boatLength,
					boatHeight, boatColor, true);
			Rectangle boat2 = new Rectangle(x12, y12, boatLength / 4,
					boatHeight * 3 / 2, boatColor, true);
			Triangle boat3 = new Triangle(x13, y13, x14, y14, x15, 
					y15, boatColor, true);
			Triangle boat4 = new Triangle(x16, y16, x17, y17, x18, 
					y18, boatColor, true);
			
			// adds the first sail to window
			this.window.add(sail1);
			// adds the pole to window
			this.window.add(pole);
			// adds the second sail to window
			this.window.add(sail2);
			// adds the flag to window
			this.window.add(flag);
			// adds the boat to window
			this.window.add(boat1);
			this.window.add(boat2);
			this.window.add(boat3);
			this.window.add(boat4);
		}
	}
}