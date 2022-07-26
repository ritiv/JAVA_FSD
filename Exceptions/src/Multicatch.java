
public class Multicatch {
	
	public static void main(String[] args) {
		try {
		String input = args[0];
		
		System.out.println("Input "+ input);
		
		int output = Integer.parseInt(input);
		System.out.println(output);
		} /*catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Give run time argument " +e);
		}
		
		catch (NumberFormatException ex) {
			
			System.out.println("cant convert var to int "+ ex);
		}*/
		
		//exception inheritance
		catch(RuntimeException ez) {
			System.out.println("Exception occured "+ez);
		}
	}

}
