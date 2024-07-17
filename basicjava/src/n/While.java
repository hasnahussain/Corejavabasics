package n;

import java.util.Scanner;

public class While
{
public static void main(String[] args)
{
	System.out.println("Enter limit number");
	Scanner sc=new Scanner(System.in);
	int limit=sc.nextInt();
	int a=1;
	while(a<=limit)
	{
		
		System.out.println(a);
		a++;
	}
}
}
