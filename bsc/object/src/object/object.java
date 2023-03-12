package object;

class show
{	void new_show()
	{
	System.out.println("Hello...");
	}
}

public class object {

	public static void main(String[] args) {
	
		show d1,d2;
		d1= new show();
		d2=d1;
		d1.new_show();
		d2.new_show();

	}

}
