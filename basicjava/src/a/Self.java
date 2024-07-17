package a;

import java.util.Scanner;

public class Self
{
public static void main(String[] args) 
{
	System.out.println("1:largest of numer\n2:odd/even \n3:multiplucationtable \nEnter a option");
	Scanner Obj=new Scanner(System.in);
	int value=Obj.nextInt();
	Self Result= new Self();
	switch(value)
	{
	case 1:
		Result.large();
		break;
	case 2:
		Result.oddeven();
		break;
	case 3:
		Result.multtable();
		break;
		default :
			System.out.println("invalid");
			break;
	}
}
	void large()
	{
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter 1st digit");
		int a=Sc.nextInt();
		System.out.println("Enter 2nd num");
		int b=Sc.nextInt();
		System.out.println("Enter the 3rd num");
		int c=Sc.nextInt();
		if((a>b)&&(a>c))
		{
			System.out.println(a+ "is greater");
		}
		else if(b>c)
		{
			System.out.println(b+"is greater");
		}
		else
		{
			System.out.println(c+"is greater");
		}
	
}
	void oddeven()
	{
		Scanner O=new Scanner(System.in);
		System.out.println("Enter a num");
		int b=O.nextInt();
		if(b%2==0)
		{
		System.out.println(b+"is even");
		}
		else
		{
			System.out.println(b+"is odd");
		}
	}
	void multtable()
	{
	Scanner m=new Scanner(System.in);
	System.out.println("Enter a num");
	int c=m.nextInt();
	if(c>5)
	{
	int d=1;
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	System.out.println(d+" * " +c+ "=" +(d++*c));
	}
	else
	{
		System.out.println("Can't display3");
	}
	}
	}

