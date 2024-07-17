package operator;

public class Operation {
	public static void main(String[] args) {
		int a=1;
		
		int b=2;

		System.out.println((a++)+(++b)+((a*b)/2)); 
		System.out.println((a++)+(--b)+(a*b)+(++a));

		System.out.println((a++)+(--b)+(b++)+(a*b));

		System.out.println((++a)+(++b)+(a*b));

		System.out.println((a++)+(a++)+(b++)+(a*b));

		System.out.println(a++);
		System.out.println(b++);

		System.out.println((a++)+(--b)+(a*b)+(++a));
		System.out.println((a++)+(--b)+(b++)+(a*b));

		System.out.println((++a)+(++b)+(a*b));

		System.out.println(a*b);

		System.out.println((a++)+(--b)+(b++)+(a*b));

		System.out.println((++a)+(++b)+(a*b));

		System.out.println((a++)+(--b)+(b++)+(a*b));

		System.out.println((++a)+(++b)+(a*b));
	}

}
