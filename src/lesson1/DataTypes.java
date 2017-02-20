package lesson1;

public class DataTypes {
	
	boolean t = false;
	
	// Two's compliment. 00000000 <- bit @ far left position, when 1, you take everything to right of it and subtract it
	// from 128 (maximum from those 7 bits).
	
	/*	
	 * 	Letters not case sensitive.
	 *  0b0 -> binary literal
	 *  0x0 -> hexadecimal literal
	 */
	
	byte b = 0;// Max = 2 ^ 7 - 1, Min = - (2 ^ 7)
	short s = 0;// Max = 2 ^ 15 - 1
	int i = 0;// Max = 2 ^ 31 - 1
	long l = 0L;// Max = 2 ^ 63 - 1
	
	// Add a fixed # of decimels at the end, based on IEEE standards and hardware limitations.
	float f = 0.0f;// Max = 2 ^ 31 - 1
	double d = 0.0d;// Max = 2 ^ 63 - 1
	
	// null = nothing. Can't be set to primitives, only objects.
	 
}
