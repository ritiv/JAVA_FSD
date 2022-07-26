import java.util.*;
public class DevidebyZero {

	public static void main(String[] args) {
		

				int a, b, c, d;
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("take the inpute of two numbers");

					a = sc.nextInt();
					b = sc.nextInt();

					c = a / b;
					d = a % b;

					System.out.println(a + "/" + b + "=" + +c + ",Remainder = " + d);
				} catch (ArithmeticException e) {
					System.out.println("Dividing by zero error ouccred " + e);
				}
				System.out.println("Outher program logic contineu bilo");

			}

		

	}


