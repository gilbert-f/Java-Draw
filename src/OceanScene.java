import java.awt.Color; // graphics library
import uwcse.graphics.*; // uw graphics library

/**
 * CSC 142 homework 1
 * 
 * Create a landscape that features 4 different types of elements (3 of the
 * types must be a sailboat, a fish, and a star)
 * 
 * @GilbertFebrianto
 */

// Creates an OceanScene class
public class OceanScene {
	/**
	 * Creates an ocean scene
	 */
	public OceanScene() {
		// The graphics window
		// the dimensions of the window is 500 by 400 pixels.
		GWindow window = new GWindow("Coastal landscape");
		// exits the program when closed
		window.setExitOnClose();

		// The ocean and the sky
		Rectangle ocean = new Rectangle(0, 0, window.getWindowWidth(), window
				.getWindowHeight(), Color.blue, true);
		// adds ocean to the window
		window.add(ocean);

		// the sky covers the upper quarter of the window
		Rectangle sky = new Rectangle(0, 0, window.getWindowWidth(), window
				.getWindowHeight() / 4, Color.black, true);
		// adds sky to the window
		window.add(sky);

		// Draw the elements in the window
		// a star in the upper left corner
		new Star(10, 10, 0.8, window);
		// another one in the middle of the sky
		new Star(250, 50, 1.5, window);
		// another star in the upper right corner
		new Star(30, 70, 0.7, window);
		
		new Star(50, 55, 1.5, window);
		
		new Star(60, 10, 2, window);
		
		new Star(90, 30, 2.3, window);
		
		new Star(130, 60, 1.3, window);
		
		new Star(150, 40, 2, window);
		
		new Star(160, 60, 0.4, window);
		
		new Star(190, 30, 2.7, window);
		
		new Star(220, 10, 2, window);
		
		new Star(250, 75, 1.2, window);
		
		new Star(270, 45, 2.7, window);
		
		new Star(300, 30, 0.4, window);
		
		new Star(340, 50, 1.3, window);
		
		new Star(370, 65, 2.3, window);
		
		new Star(410, 65, 1.3, window);
		
		new Star(430, 40, 0.6, window);
		
		new Star(470, 30, 1.2, window);
		
		new Star(480, 10, 2.2, window);
		
		new SailBoat(50, 70, 1, window);
		
		new SailBoat(410, 70, 1.2, window);
		
		new SailBoat(200, 100, 1.9, window);
		
		new SailBoat(110, 200, 2.9, window);
		
		new SailBoat(390, 250, 3.1, window);
		
		new Fish(30, 120, 0.5, window);
		
		new Fish(470, 110, 0.4, window);
		
		new Fish(240, 115, 0.6, window);
		
		new Fish(350, 130, 0.6, window);
		
		new Fish(50, 170, 1, window);
		
		new Fish(300, 230, 1.2, window);
		
		new Fish(160, 180, 1.1, window);
		
		new Fish(390, 180, 0.7, window);
		
		new Fish(210, 240, 1.05, window);
		
		new Fish(100, 350, 1.35, window);
		
		new Moon(50, 10, 1.35, window);
		
		new Moon(250, 20, 1.35, window);

		// Shows the scene
		window.doRepaint();
	}

	/**
	 * Starts the application
	 */
	public static void main(String[] args) {
		// defines the new OceanScene object
		new OceanScene();
	}
}
