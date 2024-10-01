package VariableDemos;

public class budzDemo2 
{

	public static void main(String[] args) 
	{
		int grosssalary=100000;
		 budzDemo2  bd1 = new  budzDemo2 ();
		 int netsalary = grosssalary - bd1.housecharges();
		 System.out.println(netsalary);
	}
	int housecharges()// int housecharges= totalcharges
	{
		int rent=20000;
		int childfee=10000;
		int totalcharges=rent+childfee;
		System.out.println(totalcharges);
		return totalcharges;
	}
}
