import java.lang.Math;
class area
{
	float res,p,temp;
	private static float pi=(float)3.141;
	
	float area_cal(int i)
	{
		res=pi*(i*i);
		return res;
	}
	float area_cal(int i,int j)
	{
		res=i*j;
		return res;
	}
	float area_cal(int i,int j,int k)
	{
		p=(i+j+k)/2;
		temp=(p*(p-i)*(p-j)*(p-k));
		res=(float)Math.sqrt(temp);
		return res;
	}
}
public class Figure {
	public static void main(String[] args)
	{
		area circle= new area();
		area squar= new area();
		area triangle= new area();
		
		System.out.println("Area of CIRCLE(r=7)==>"+circle.area_cal(8));
		System.out.println("Area of SQUAR(l=5)==>"+squar.area_cal(5,5));
		System.out.println("Area of TRIANGLE(a=4,b=5,c=6)==>"+triangle.area_cal(4,5,6));

	}
}
