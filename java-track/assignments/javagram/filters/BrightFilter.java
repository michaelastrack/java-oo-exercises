package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class BrightFilter implements Filter{
	
	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
	    for (int i = 0; i < original.width(); i++) {
	      for (int j = 0; j < original.height(); j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          //get color components from each pixel
	          int r = c.getRed();
	          int g = c.getGreen();
	          int b = c.getBlue();
	          
	          if (r > 175) {
	        	  r = 255;
	          }
	          else {
	        	  r = r + 80;
	          }
	          
	          if ( g > 175) {
	        	  g = 255;
	          }
	          else {
	        	  g = g + 80;
	          }
	          
	          if (b > 175) {
	        	  b = 255;
	          }
	          else {
	        	  b = b + 80;
	          }
	          
	          processed.set(i, j, new Color(r, g, b));
	    	  
	      }
	    }
		
		return processed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
