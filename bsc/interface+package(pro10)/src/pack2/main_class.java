package pack2;
import pack1.*;

public abstract class A implements pack1.I1,pack1.I2
{
	int n;
	public void f1()
	{
		 n =10;
	}
	public void f2()
	{
		System.out.println("The value is==>"+n);
	}

}
public class main_class {

	public static void main(String[] args) {
		I1 obj=new A();
	}

}
