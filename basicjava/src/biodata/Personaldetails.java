package biodata;

public class Personaldetails 
{
	void personals()
	{
	System.out.println("Name: Hasna");	
	System.out.println("Father Name: Hussain M");
	System.out.println("Mother Name: Rejula J");
	}
void education()
{
	System.out.println("Qualification: B-tech ");
	System.out.println("College: PEC");
	System.out.println("Year of passout: 2024");
	
}
public static void main(String[] args) 
{
	Personaldetails a=new Personaldetails();
	Personaldetails  b=new Personaldetails();
	a.personals();
	b.education();
}
}
