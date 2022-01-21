import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * A class demonstrating manipulation of image pixels.
 * Version 0: just the core definition
 * 
 * @author Chris Bailey-Kellogg, Dartmouth CS 10, Fall 2012
 * @author CBK, Winter 2014, rewritten for BufferedImage
 * @author CBK, Spring 2015, refactored to separate GUI from operations
 */
public class ImageProcessor0 {
	private BufferedImage image;		// the current image being processed

	/**
	 * @param image		the original
	 */
	public ImageProcessor0(BufferedImage image) {
		this.image = image;
	}
	
	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	/**
	 * draw a colored circle wherever the mouse cursor lies, act like a brush
	 *
	 * @param cx x location of mouse
	 * @param cy y location of mouse
	 * @param r radius of circle
	 * @param color color to draw with
	 */
	public void drawCircle(int cx, int cy, int r, Color color) {
		for (int x = Math.max(0, cx - r); x < Math.min(image.getWidth() - 1, cx + r); x++) {
			for (int y = Math.max(0, cy - r); y < Math.min(image.getHeight() - 1, cy + r); y++) {
				if (((cx - x)*(cx - x) + (cy - y)*(cy - y)) < (r*r)) {
					// System.out.println(((cx - x)*(cx - x) + (cy - y)*(cy - y)) + ", " + (r*r)); // tester code
					image.setRGB(x, y, color.getRGB());
				}
			}
		}
	}
}
