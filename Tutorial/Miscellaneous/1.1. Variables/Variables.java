public class FirstCode {
	public static void main(String args[])
	{
		long l = 5l;  // 8 bytes
		int i = 5; // 4 bytes
		short s=5; // 2 bytes >> -32768 to 32768
		byte b=5;  // 1 byte >> -128 to 128
		
		float f=5.5f; // 4 bytes
		double d=5.5; // 8 bytes
		
		char c= 'A';	// 2 bytes
		
		boolean is_true= false;  //1 byte
		
		double d1= 5;   // implicit conversion
		int k= (int)5.6;  //type casting
	}

}
