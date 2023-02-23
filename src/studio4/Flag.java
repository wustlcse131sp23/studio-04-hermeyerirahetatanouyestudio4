package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		
	    Color pink = new Color (252,179, 252);
	    StdDraw.setPenColor(pink);
	    StdDraw.filledRectangle(.5,.5,1,1);
		
		
		Color lightBlue = new Color(188, 208, 255);
		StdDraw.setPenColor(lightBlue);
		StdDraw.filledCircle(.5, .5, .5);
		
		Color seafoam = new Color(188, 255, 233);
		StdDraw.setPenColor(seafoam);
		StdDraw.filledCircle(.5, .5, .4);
		
		Color light = new Color(237, 246, 249);
		StdDraw.setPenColor(light);
		StdDraw.filledCircle(.5, .5, .2);
		
		
		Color verde = new Color(6, 81, 67);
		StdDraw.setPenColor(verde);
		double [] x= {0.5, 0.6, 0.7, 0.1};
		double[]y = {0.7, 0.3 , 0.5, 0.7};
		StdDraw.polygon(x, y);
		
		double [] xOne= {0.4, 0.2, 0.8, 0.3};
		double[]yOne = {0.5, 0.9 , 0.1, 0.2};
		StdDraw.polygon(xOne, yOne);
		
		double [] xTwo= {0.15, 0.3, 0.6, 0.9};
		double[]yTwo = {0.1, 0.2 , 0.8, 0.7};
		StdDraw.polygon(xTwo, yTwo);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}