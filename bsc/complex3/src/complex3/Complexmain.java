package complex3;


class Complex
{
	
		int real,img;
		
		void getData(int x, int y)
		{
			real=x;
			img=y;
		}
		
		void add(Complex a, Complex b)
		{
		    
		    real=a.real+b.real;
		    img=a.img+b.img;
		}
		void sub(Complex a, Complex b)
		{
			real=a.real-b.real;
			img=a.img-b.img;
		}
		void mul(Complex a, Complex b)
		{
			real=(a.real*b.real)-(a.img*b.img);
			img=(b.real*a.img)+(a.real*b.img);
		}
		void mod(Complex a)
		{
			int mod;
			//mod=math.sqrt((a.real*a.real)+(a.img*a.img));
			// System.out.println(+mod);
		}
		void div(Complex a, Complex b)
		{
			if(b.img>=0)
			{
				real=((a.real*b.real)+(a.img+b.img))/((b.real*b.real)+(b.img*b.img)); 
				img=((a.real*b.img)+(b.real*a.img))/((b.real*b.real)+(b.img*b.img));
			}
			else
			{
				real=((a.real*b.real)-(a.img+b.img))/((b.real*b.real)+(b.img*b.img));
				img=((a.real*b.img)+(b.real*a.img))/((b.real*b.real)+(b.img*b.img));
			}
		}
		void show()
		{
			if(img>=1&&real>=1)
			System.out.println(+real+" + "+img+"i");
			else
		    System.out.println("("+real+")"+" + "+"("+img+"i"+")");	
		}
		
}

public class Complexmain {

	public static void main(String[] args) {
		Complex obj1,obj2,Add,Sub,Mul,Mod,Div;
		Div=new Complex();
		Mod = new Complex();
		Mul= new Complex();
		Sub= new Complex();
		Add= new Complex();
		obj2= new Complex();
		obj1= new Complex();
		obj1.getData(9,11);
System.out.println("THE 1st COMPLEX NO IS==> ");
        obj1.show();
		obj2.getData(10,12);
System.out.println("THE 2nd COMPLEX NO IS==> ");
        obj2.show();
        Add.add(obj1,obj2); // add
System.out.println("ADDITION OF 2 CMPLX NO IS ==>");
		Add.show();
		Sub.sub(obj1,obj2); // sub
System.out.println("SUBSTRACTION OF 2 CMPLX NO IS ==>");
		Sub.show();	
		Mul.mul(obj1,obj2); // mul
System.out.println("MUL OF 2 CMPLX NO IS ==>");
        Mul.show();
        Mod.mod(obj1);  //modulus
System.out.println("MOD OF CMPLX NO IS ==>");
        
		Div.div(obj1, obj2);
System.out.println("Div OF 2 CMPLX NO IS ==>");
		Div.show();
	}

}
