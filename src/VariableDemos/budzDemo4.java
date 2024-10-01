package VariableDemos;

public class budzDemo4 
{

	public static void main(String[] args) 
	{
		int grosssalary=100000;
		 budzDemo4  bd1 = new  budzDemo4 ();
		 int charges = bd1.housecharges();
		 int netsalary = grosssalary - bd1.housecharges();
		 System.out.println(netsalary);
		 int taxcal =30* bd1.housecharges();
		 System.out.println(taxcal);
	}
	int housecharges()
	{
		int rent=20000;
		int childfee=10000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
	}
}
