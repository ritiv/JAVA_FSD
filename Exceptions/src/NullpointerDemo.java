import java.util.*;
public class NullpointerDemo {
	
	public static void main(String[] args) {
		
		
			try {
			String s = null;
			System.out.println("Length of string "+ s.length());
			}
			catch(NullPointerException e) {
				
				System.out.println(e);
			}
	}

}
