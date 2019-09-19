import java.awt.*;
import java.applet.Applet;
public class Demo1 extends Applet  {
	Image myImage;
	public void init ( ) {
			myImage = getImage (getDocumentBase ( ), "snakes.png" );
	}
	public void paint (Graphics g) {
		 g.drawImage(myImage, 25, 25, this);
	}
}