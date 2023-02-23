package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		
		
		String shape = in.next();
		System.out.print(shape);
		
		int red = in.nextInt();
		System.out.println(red);
		
		
		int green = in.nextInt();
		System.out.println(green);
		
		int blue = in.nextInt();
		System.out.println(blue);
		
	
		boolean fill =in.nextBoolean();
		
		if( fill == true) {
			Color RGB = new Color(red,green,blue);
			StdDraw.setPenColor(RGB);
			if (shape.equals("rectangle")){
				double x = in.nextDouble();
				double y = in.nextDouble();
				double halfW=in.nextDouble();
				double halfH=in.nextDouble();
				StdDraw.filledRectangle(x,y,halfW,halfH);	
			}
			
			
			
			
	
		}
		
		
		
		
		
		
		
		//double [] x= {0.5, 0.6, 0.7};
	//	double[]y = {0.7, 0.3 , 0.5};
		//StdDraw.setPenColor(Color.RED);
	//	StdDraw.polygon(x, y);

		
		
		
		
		
		
		
	}
}

