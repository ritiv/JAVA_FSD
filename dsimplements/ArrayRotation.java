package dsimplements;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] a=new int[]{1,2,3,4,5};
		int n=1;
		System.out.println("Original array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		//rotate array toward right 
		for(int i=0;i<n;i++) {
			int j,last;
			last=a[a.length-1];//Stores the last element of array
			for(j=a.length-1;j>0;j--)
			{
				//shift array one by one
				a[j]=a[j-1];
			}
			a[0]=last;
			
		}
		System.out.println();
		System.out.println();
		System.out.println("Array rotate right side");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}

}
