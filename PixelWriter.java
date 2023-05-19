
import java.awt.Color;

public interface PixelWriter{
	/* setPixel(x,y,c)
	   Set the pixel at coordinates (x,y) in the image
	   to the provided color.
	*/
	void setPixel(int x, int y, Color c);
}