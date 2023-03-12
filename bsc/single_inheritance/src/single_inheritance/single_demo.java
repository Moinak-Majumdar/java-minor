package single_inheritance;

class Base
{
	int a,b;
	Base (int x, int y)
	{
		a=x;
		b=y;
	}
}
class Derived extends Base
{   
	Derived(int x,int y)
	{
	super(x,y);
	}
	
	void show() 
	{
		System.out.println("sum is="+(a+b));
	}
}
public class single_demo {                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                

	public static void main(String[] args) {
	
		Derived obj2= new Derived(10,20);
		
		obj2.show();

	}

}
