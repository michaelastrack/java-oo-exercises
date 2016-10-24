package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = "";
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				/*
				String[] relPathParts = relPath.split(File.separator);
				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				*/
				
				imagePath = (dir + "\\" + relPath);
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);
		
		// TODO - prompt user for filter and validate input
		boolean invalid = true;
		int input = 0;
		int numfilters = 7;
		while (invalid) {
		
		System.out.println("1) Blue Filter");
		System.out.println("2) Red Filter");
		System.out.println("3) Green Filter");
		System.out.println("4) Flip Horizontal");
		System.out.println("5) Flip Vertical");
		System.out.println("6) Flip Diagnolly");
		System.out.println("7) Brighten");
		System.out.println("Enter in the number of the filter that you want:");
		
		input = in.nextInt();
		if (input < 1 || input > numfilters) {
			System.out.println("Invalid selection, please try again.");
		}
		else {
			invalid = false;
		}
		} 
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back 
		
		Filter filter = getFilter(input);


		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} 
		else if (fileName.equals(relPath)) {
			System.out.println("Are You Sure that you want to overwrite the original file? (y/n)");
			String confirm = in.next();
			if (confirm.equals("y")) {
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);	
			}
			else {
				System.out.println("Please enter a new file name different from the original filename.");
				fileName = in.next();
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
			}
		}
		
		else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int input) {
		
		// TODO - create some more filters, and add logic to return the appropriate one
		
		if (input < 1 || input > 7) {
			throw new IllegalArgumentException();
		}
		
		if (input == 1) {
			return new BlueFilter();
		}
		else if (input == 2) {
			return new RedFilter();
		}
		else if (input == 3){
			return new GreenFilter();
		}
		else if (input == 4) {
			return new FlipHorizontal();
		}
		else if (input == 5){
			return new FlipVertical();
		}
		else if (input == 6) {
			return new FlipDiagnol();
		}
		else {
			return new BrightFilter();
		}
		
	}

}