package javagram.filters;

import java.awt.Color;

import javagram.Picture;

public class FlipVertical implements Filter{
	
	public Picture process(Picture original) {
		
		Picture processed = new Picture(original.width(), original.height());
        
	    //get each pixel one by one
		int w = original.width();
		int h = original.height();
	    for (int i = 0; i < w; i++) {
	      for (int j = 0; j < h; j++) {
	    	  
	    	  Color c = original.get(i, j);
	          
	          processed.set(i, h - (j+1), c);
	    	  
	      }
	    }
		
		return processed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
