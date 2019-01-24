package keerthi.javalearn;

public class FirstClass {
	int p;
	int x;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;
		int b=30;
		System.out.println(add(a,b));
		FirstClass obj = new FirstClass();
		System.out.println(obj.mul(2,3));
		obj.p=20;
		obj.q=40;
		
	
		
		
		obj.swap(obj);
		obj.print(5);
		
		System.out.println("the value of p after swap is: " + obj.p);
		System.out.println("the value of q after swap is: " + obj.q);
	}

	public static int add(int x,int y) {
		x=40;
		y=50;
	int z;
	z=x+y;
	return z;
	}
	
	private void swap(FirstClass obj){
		int w =obj.p;
		obj.p=obj.q;
		obj.q = w;
	
	}
	
	public int mul(int x,int y){
		int z;
		z= x*y;
		return z;
	}
	
	public int print(int x)
	{   
		
		if(x>2){
		System.out.println("x is big"+ x);
		}
		else	
		System.out.println("x is small");
		return x;
		
	
	}
}
