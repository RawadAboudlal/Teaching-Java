package lesson1;

public class Lesson1 {
	
	/**
	 * This is called javadoc text (or java documentation). Notice the difference between this and regular multiline comments
	 * is that these start with two asterisks, '*', instead of one. The javadoc command that comes with the JDK converts this
	 * into HTML so regular HTML rules apply here, as well.
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		// This is a comment.
		/*
		 * This is a multi-line comment.
		 * Many lines.
		 * 
		 * Empty ones too.
		 */
		/* Can be closed in the same line (inserted within code in this way as well). */
		
		int x = 0;
		
		if(x > 10) {
			System.out.println("x > 10");
		} else if(x < 5) {
			System.out.println("x < 5");
		} else {
			System.out.println("x >= 5 and x <= 10");
		}
		
		char c = '\u2122';
		
		System.out.println(c);
		
		String s = "abc123";
		
		if(s.charAt(0) == 'a') {
			System.out.println("s has a at position 0.");
		}
		
		float[] floatsArray = {
				0.5f,
				0.3f,
				0.2f
		};
		
		// or
		
		floatsArray = new float[] {
				0.5f,
				0.6f,
				0.7f
		};
		
		// Each elemnt from i to i - 1 (inclusive) is initialized to default value (0 for int). For Objects it's null.
		// Not true for multi-dimensional arrays (will be null at each position since each is an Object).
		int[] intArray = new int[1];
		
		byte[][] multiDimensions = {
				{1, 2},
				{3, 4}
		};
		
		// This is a type of loop. Keeps on going until an "unknown point" in the future.
		
		long timePassed = 0L;
		
		while(timePassed < 10) {
			
//			/* ++ same as += 1 */
			timePassed++;
			System.out.println("Time now passed: " + timePassed);
			/**/
			
			// ++ increment used in different ways, mean different things:
//			System.out.println("Time now passed: " + ++timePassed);// Adds 1 before it can be printed. Prints 1,2,...,10
//			System.out.println("Time now passed: " + timePassed++);// Prints current value, then 1 is added. Prints 0,1,...,9
			
		}
		
		System.out.println("Printing out numbers in float array:");
		
		for(int i = 0; i < floatsArray.length; i++) {
			System.out.println(floatsArray[1]);
		}
		
		System.out.println("Printing out numbers in float array with for-each:");
		
		for(float f: floatsArray) {
			System.out.println(f);
		}
		
		// While loop
		boolean hot = false;
		
		double temp = 15.6d;
		
		while(!hot) {
			
			if(temp > 30) {
				hot = true;
				System.out.println("now it's hot");
			}
			
			temp += 10;
			
		}
		
		// Break
		boolean found = false;
		
		String[] names = {"Carl", "Max", "Mark", "Lee", "Tom", "Bob", "Maple", "Jim", "Dough", "Marlin"};
		
		for(String name: names) {
			
			if(name.equals("Lee")) {
				found = true;
				break;// No need to search any further because name is found. Notice the IDE highlight.
			}
			
		}
		
		System.out.println("Lee found? " + found);
		
		// Continue
		for(String name: names) {
			
			if(name.startsWith("M")) {
				
				System.out.println(name + " starts with M. You're different...");
				continue;
				
			}
			
			System.out.println("Hi " + name + "! This is Patrick.");
			
		}
		
	}
	
}
