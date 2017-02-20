package lesson2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Lesson2 {
	
	public static void main(String[] args) {
		
		/* Objects are instances of Classes. */
		
		Lesson2 l2 = new Lesson2();
		
		/* User input. */
		BufferedReader reader = null;
		
		// DON'T WRITE CATCH YET, do it later to show to find which exceptions need to be caught.
		try {
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			
			String input = "";
			
			while(!input.equalsIgnoreCase("Exit")) {
				
				input = reader.readLine();
				
				System.out.println("Nice input: \"" + input + "\"");
				
			}
			
		} catch(Exception ex) {
			System.err.println("Error creating input stream reader for default input.");
		} finally {
			
			try {
//				reader.close();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		
		// try-with-resource
		try (BufferedReader tempReader = new BufferedReader(new InputStreamReader(System.in))) {
			
			// More complex for-loop logic
			for(String input = tempReader.readLine(); !input.equalsIgnoreCase("Exit"); input = tempReader.readLine()) {
				System.out.println("Nice input: \"" + input + "\"");
			}
			
		// Catch specific exceptions.
		} catch(IOException ex) {
			ex.printStackTrace();
		} catch(Exception ex) {
			System.err.println("Caught a default exception.");
		}
		
		/* File I/O. */
		
		try (PrintWriter writer = new PrintWriter(new FileOutputStream("test.txt"));) {
			
			// STOP. What are the values of i here?
			for(int i = 1; i <= 10; i++) {
				writer.println(i);
			}
			
			writer.flush();
			
			// No need to close, because try-with-resource.
			
		} catch(FileNotFoundException ex) {
			System.err.println("File not found.");
		}
		
		CustomObject co1 = new CustomObject(10, 20);
		CustomObject co2 = new CustomObject(-34, 63);
		
		// See docs for more info.
		System.out.printf("co1 x,y: %s,%s. co2 x,y: %s,%s", co1.getX(), co1.getY(), co2.getX(), co2.getY());
		System.out.println("Total number of objects made: " + CustomObject.getNumberOfObjects());
		
	}
	
}
