import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.util.Random;
import java.lang.Math.*;

public class MainCircles extends JFrame {
	
	Dimension size = Toolkit.getDefaultToolkit().getScreenSize(); //determining the screen size so that we can open
	int width = (int)size.getWidth();							  //the frame in fullscreen, regardless of the monitor it is used
	int height = (int)size.getHeight();

    public MainCircles() //creates the frame where the circles will be drawn on
    {
        setTitle("Circle Drawing NFT-s");//name of the program
        setSize(width, height);//calling the dimensions of the screen
        setVisible(true);//setting the visibility
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    Random centre = new Random();//defining the object centre for the random coords of the circle
    //Random length = new Random();
    
    int upperbound = 1000;
    int centreCoord = centre.nextInt(upperbound);
    
    int upperLength = 500, lowerLength = 10;
    int length = (int) (Math.random() * (upperLength - lowerLength)) + lowerLength;//exclusive to upper, inclusive to lower, gets random
    																			   //values between lowerLength and upperLength
    @Override
    public void paint(Graphics g) 
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(new Color(125, 167, 116));//sets the color which will be used to fill the circles
        g2d.drawOval(centreCoord, centreCoord, length, length);//draws the circle
        g2d.fillOval(centreCoord, centreCoord, length, length);//fills the circle with color
    }

    public static void main(String[] args) 
    {

       new MainCircles();

    }
}