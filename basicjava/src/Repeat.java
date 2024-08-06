import java.util.Scanner;

public class Repeat 
{
public static void main(String[] args) 
{
System.out.println("Enter a string");
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int length=str.length()-1;
int count=0;
String str1="";
while(length>0)
{
	str1=str1+str.charAt(length);
if(str.contains(str1) )
{
	count++;
	System.out.println(str1.charAt(count));
}
else
{
	System.out.println();
}
length--;
}

}

}
