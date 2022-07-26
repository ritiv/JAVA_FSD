package Channing;

public class child extends parent{
	
	int b;
	
	child(){
		
		this(67);
		
		System.out.println("child constructor: NO Arg");
	}
	
	child(int a){
		
		super(11);
		
		this.b = a;
		System.out.println(a);
		
		System.out.println("With arg");
		
	}

}
