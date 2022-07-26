
public class non_static_class {
	
	int num;
	{
		System.out.println("i am getting it");
	}

	non_static_class(int x){
		this.num=x;
		System.out.println("inside the constructor");
	}
	public static void main(String args[]) {
		
		System.out.println("inside the main method");
		non_static_class obj = new non_static_class(78);
		non_static_class obj1 = new non_static_class(48);
		
		
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
	
	
}
