package practiceProject6;

public class stringConversion {
	
	public static void main(String[] args) {
		
		String s6 = "Conversion of Strings";
		
		String s7 = "to other type of Strings";
		
		System.out.println("Converting the String to StringBuffer");
		
		StringBuffer s8 = new StringBuffer(s6);
		
		System.out.println(s8.append(s7));
		
		System.out.println(s8.insert(10, 's'));
		
		StringBuilder s9 = new StringBuilder(s7);
		
		System.out.println(s9.delete(2, 7));
		
		System.out.println(s9.reverse());
	
	}

}
