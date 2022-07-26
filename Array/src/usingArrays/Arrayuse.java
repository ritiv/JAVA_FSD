package usingArrays;

public class Arrayuse {
	
	public static void main(String[] args) {
		
		int arr1[];
		
		int arr2[] = {10,20,67,87};
		
		int arr3[] = new int[3];
		arr3[0] = 23;
		arr3[1] = 45;
		arr3[2] = 87;
		
		System.out.println("Printing the elements of the array  ");
		System.out.println("length of the array: " + arr3.length);
		
		for (int i = 0; i < arr3.length; i++) {
			
			System.out.println(arr3[i]);
		}
		
		System.out.println("------------");
		
		for (int element : arr3) {
			
			System.out.println(element);
		}
		
		
	}

}
