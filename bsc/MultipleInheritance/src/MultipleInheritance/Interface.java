package MultipleInheritance ;

import java.util.*;

class Student
{
	int roll;
	String name;
	
	void Getinfo()
	{
	System.out.println("Enter Name==>");
	Scanner sc = new Scanner(System.in);
	name= sc.nextLine();
	
	System.out.println("Enter Roll==>");
	Scanner sc2 = new Scanner(System.in);
	roll= sc2.nextInt();
	}
	void Showinfo()
	{
		System.out.println("Name	: "+name);
		System.out.println("Roll	: "+roll);
	}
	
}

class marks extends Student
{
	int pep1,pep2;
	
	void Getno()
	{
		System.out.println("Enter pepar1 marks==>");
		Scanner sc = new Scanner(System.in);
		pep1= sc.nextInt();
		
		System.out.println("Enter pepar2 marks==>");
		Scanner sc2 = new Scanner(System.in);
		pep2= sc2.nextInt();
	}
	
	void Showno()
	{
		System.out.println("pepar1 marks	:"+pep1);
		System.out.println("pepar2 marks	:"+pep2);
	}
}

interface sgpa
{
	int credit=5;
	void showSGPA();
}

class result extends marks implements sgpa
{
public void showSGPA()
	{
		double sgpa;
		
		sgpa= ((pep1*credit)+(pep2*credit))/(credit*2);
		Getinfo();
		Getno();
		System.out.println("Credit of each subject="+credit);
		Showinfo();
		Showno();
		System.out.println("SGPA	:"+sgpa);
	}
}
public class Interface {

	public static void main(String[] args) {
	
		result obj = new result();
		obj.showSGPA();

	}

}
