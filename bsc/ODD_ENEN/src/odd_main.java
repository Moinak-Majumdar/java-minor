public class odd_main {

	public static void main(String[] args) {
	abc obj;
	obj= new abc();
	obj.calc();
}
}
 
class abc
{
	void calc()
	{
	int num[]= {10,15,20,30,40,45};
	int even=0,odd=0;
	for(int i=0;i<num.length;i++)
	{	
	if(num[i]%2==0)
		even=even+1;
	else
		odd+=1;
	}
System.out.println("Even==>"+even);
System.out.println("Odd==>"+odd);
	}
}

	