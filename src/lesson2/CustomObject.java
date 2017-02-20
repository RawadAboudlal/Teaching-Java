package lesson2;

public class CustomObject /* extends Object <- implicit. */ {
	
	// This is preferred when possible.
	private int x = 0;
	private int y = 0;
	
	// Make without x,y first, then make getters, then add x,y and remove x=0,y=0 up top.
	// Once this is present v and  v there is no need to initialize it up top.
	public CustomObject(int x, int y) {
		super();
		
		System.out.println("Duty calls for I have been...\n*dramatic pause*\n...INSTANTIATED.");
		
		this.x = x;
		this.y = y;
		
		numberOfObjects++;
		
	}
	
	//
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public static int multXandY() {
//		return x * y;// Doesn't work, x and y only known in per-object context.
		return 0;
	}
	
	private static int numberOfObjects = 0;
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
}
