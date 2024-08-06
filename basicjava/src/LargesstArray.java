import java.util.Scanner;

public class LargesstArray
{
public static void main(String[] args) {
	System.out.println("Enter number of elements in array");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println("Enter elements in array");
	int[] ar=new int[n];
	for(int i=0;i<n;i++)
	{
		ar[i]=sc.nextInt();
	}
	int largest=ar[0];
	for(int i=0;i<n;i++)
	{
		if(ar[i]>largest)
		{
			largest=ar[i];
		}
	}
	System.out.println("the largest array"+largest);
}
}
