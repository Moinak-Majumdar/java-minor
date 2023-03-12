package pack2;
import pack1.*;

class A implements i1
{
	public void f1()
	{
		int i=5;
		System.out.println("the value is"+i);
	}
}
class main_C
{
	
	public static void main(String args[])
	{
		i1.f1();
	}
}