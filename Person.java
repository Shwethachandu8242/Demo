class Person
{
	static void Work(String Company, double Salary)
	{
		System.out.println("Enerted companywork");
		System.out.println("Company:"+Company);
		System.out.println("Salary:"+Salary);
		if(Company=="HP" &&  Salary==30000)
		{
			System.out.println("Company and Salary:" +Company +Salary);
		}
	}
	static void Work(String Company, double Salary ,String Destination)
	{
		System.out.println("Company:"+Company);
		System.out.println("Salary:"+Salary);
		System.out.println("Destination:"+Destination);
		if(Company=="Wipro" &&  Salary==40000 && Destination=="Developer")
		{
			System.out.println("Company and Salary and Destination:" +Company +Salary +Destination);
		}
	}
}