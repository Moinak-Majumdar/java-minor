class surface
{
	float r,a,b,x,y,z,res=1;
	private static float pi=(float)3.141;
	
	public surface(float i)
	{ r=i; }
	
	public surface(float i,float j)
	{ a=i; b=j;}
	
	public surface(float i,float j,float k)
	{	x=i; y=j; z=k; }
	
	public void cir_surface() 
	{	
		res=pi*(r*r);
		System.out.println("The surface area of a circle is==>"+res);
	}	
	public void sq_surface()
	{
		res=a*b;
		System.out.println("The surface area of a squar is==>"+res);
	}
	public void tr_surface()
	{
		float p=(x+y+z)/2;
		float temp=(p*(p-x)*(p-y)*(p-z));
		res=(float)Math.sqrt(temp);
		System.out.println("The surface area of a triangle is==>"+res);
	}
}	
public class Figure 
{
	public static void main(String[] args)
	{
		surface circle= new surface(7);
		circle.cir_surface();
		surface squar = new surface(4,4);
		squar.sq_surface();
		surface triangle= new surface(2,3,4);
		triangle.tr_surface();
		}
}
