package Array;

public class Test {

	public static void main(String[] args) {
		
		Rotatearray r = new Rotatearray();
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
		
		r.rotate(arr, 5); 
		
		for(int i=0;i<arr.length;i++){
    		
			System.out.print(arr[i]+" ");
		}


	}

}
