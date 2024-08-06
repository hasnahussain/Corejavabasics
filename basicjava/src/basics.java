import java.util.Scanner;

public class basics {
public static void main(String[] args) {
	//method1
	String name=new String("hasna");
	System.out.println(name);
	//method2
	String name1="krishna";
	System.out.println(name1);
	System.out.println(name+name1);
	//dynamic enduser
	System.out.println("Enter your name");
	Scanner sc=new Scanner(System.in);
	//String str=sc.next(); then space save akum
	String str=sc.nextLine();
	String str1="Hello";
	
	System.out.println(str1+" " +" "+str);
	
}
}
