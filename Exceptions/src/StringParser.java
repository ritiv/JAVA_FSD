import java.util.*;

public class StringParser {
	public static void main(String[] args) {
		
	try {
	
	String st = "abcd";
	
	int a = Integer.parseInt(st);
	System.out.println("Result" + st);
	}
	catch(NumberFormatException e) {
		
		System.out.println(e);
	}
	System.out.println("Rest will follow through");
	
}
}