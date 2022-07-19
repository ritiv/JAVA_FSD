package practiceProject6;

public class stringMethods {
	
	public static void main(String[] args) {
		
		String s1 = new String("Implimentation of stringMethods");
		
		String s2 = new String("Recalling all methods");
		
		String s3 = "Termenologies";
		
		String s4 = "in String";
		
		String s5 = "";
		
		System.out.println("Implimentation of all String Methods");
		
		System.out.println(s1.charAt(7));
		
		System.out.println(s2.length());
		
		System.out.println(s3.substring(2, 5));
		
		System.out.println(s3.compareToIgnoreCase(s4));
		
		System.out.println(s5.isEmpty());
		
		System.out.println(s1.toLowerCase());
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s4.replace('i', 'I'));
				
	}

}
