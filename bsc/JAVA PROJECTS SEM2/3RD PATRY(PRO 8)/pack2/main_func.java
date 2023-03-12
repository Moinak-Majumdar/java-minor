package pack2;
import pack1.*;

class child extends parent
{
	public int show()
	{
		return res;
	}
}
public class main_func
{
	public static void main(String[] args) 
	{
		child obj = new child();
		obj.add();
		System.out.printf("The result is = %d",obj.show());
	}
}
