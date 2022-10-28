/*
 * Written by Aaron King
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
public class TriangleFractal extends Canvas{
public static final int frameSize = 900;
int topX = frameSize/2;
int topY = 0;
int leftX = 0;
int leftY = frameSize;
int rightX = frameSize;
int rightY = frameSize;
int count = 0;
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Triangle Fractal");
		frame.setSize(frameSize, frameSize);
		TriangleFractal tf = new TriangleFractal();
		frame.add(tf);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void paint(Graphics g)
	{
		drawBase(g);
		fillBase(topX, topY, leftX, leftY, rightX, rightY, g);
	}
	public void drawBase(Graphics g)
	{
		
		int[] xPoints = new int[3];
		int[] yPoints = new int[3];
		xPoints[0] = topX;
		yPoints[0] = topY;
		xPoints[1] = leftX;
		yPoints[1] = leftY;
		xPoints[2] = rightX;
		yPoints[2] = rightY;
		g.fillPolygon(xPoints, yPoints, 3);
		
		
	}
	public void fillBase(int topX, int topY, int leftX, int leftY, int rightX, int rightY, Graphics g)
	{
			int side = rightY-topY;
			//Draw the white triangle
			g.setColor(getBackground());
			int[] xPoints2 = new int[3];
			int[] yPoints2 = new int[3];
			int newLeftX = (leftX + topX)/2;
			xPoints2[0] = newLeftX;
			int newLeftY = (topY + leftY)/2;
			yPoints2[0] = newLeftY;
			int newRightX = (topX+rightX)/2;
			xPoints2[1] = newRightX;
			int newRightY = (topY + rightY)/2;
			yPoints2[1] = newRightY;
			int newBotX = topX;
			xPoints2[2] = newBotX;
			int newBotY = rightY;
			yPoints2[2] = newBotY;
			g.fillPolygon(xPoints2, yPoints2, 3);
			//Recursively call for 3 surrounding triangles.
			//Triangle above white triangle
			if(side>=112)
			{
				fillBase(topX, topY, newLeftX, newLeftY, newRightX, newRightY, g);
				//triangle to left of white triangle
				fillBase(newLeftX,newLeftY, leftX, leftY, newBotX, newBotY, g);
				//triangle to right of white triangle
				fillBase(newRightX, newRightY, newBotX, newBotY, rightX, rightY, g);
			}
	}

}
