package cons_inheritance;      
//	constructor overloading
// 	MULTILEVEL INHERITANCE	
class box
{
	int height,width,depth;
	
	box(box obj)
	{
		height= obj.height;
		width= obj.width;
		depth= obj.depth;
	}
	box(int x,int y,int z)
	{
		height=x;
		width=y;
		depth =z;
	}
	box(int x)
	{
		height=width=depth=x;	//For cube
	}
	void area()
	{
		System.out.println("Area of the box is ==>"+(height*width*depth));
	
	}
}

class Box_weight extends box
{
	int weight;
	Box_weight(box ob, int x)
	{
		super(ob);
		weight=x;
	}
	Box_weight(int x,int y,int z,int s)
	{
		super(x,y,z);
		weight=s;
	}
	Box_weight(int x,int y)
	{
		super(x);
		weight=y;
	}
	void show()
	{
		System.out.println("Weight is==>"+weight);
	}
}
class shipment extends Box_weight
{
	int  cost;
	shipment(box ob,int x,int y)
	{
		super(ob,x);
		cost=y;
	}
	shipment(int x,int y,int z,int s,int m)
	{
		super(x,y,z,s);      
		cost=m;
	}
	shipment(int x,int y,int z)
	{
		super(x,y);
		cost=z;
	}
	void show_cost()
	{
		System.out.println("Shipment cost is==> "+cost);
	}
}

public class box_demo {

	public static void main(String[] args) 
	{
		box obj=new box(10,12,13);
		shipment obj1= new shipment(obj,5,100);
		obj1.area();
		obj1.show();
		obj1.show_cost();
		shipment obj2= new shipment(10,11,12,50,500);
		obj2.area();
		obj2.show();
		obj2.show_cost();
		shipment obj3= new shipment(10,40,350);
		obj3.area();
		obj3.show();
		obj3.show_cost();
	}

}
