class Vehicle{
	static double Transport(String Source,double Destination)
	{
		System.out.println("Enerted Transport");
		System.out.println("Source:"+Source);
		System.out.println("Destination:"+Destination);
		if(Source=="Banglore" &&  Destination==350)
		{
			System.out.println("the journey Starts from Banglore and end to Sandur");
			return 350;
		}
		return 0;
	}
		
	static double Transport(String Source,double Destination, boolean onTime)
	{
		System.out.println("Enerted Transport");
		System.out.println("Source:"+Source);
		System.out.println("Destination:"+Destination);
		System.out.println("onTime:"+onTime);
		if(Source=="Manglore" &&  Destination==150 && onTime==true)
		{
			System.out.println("the journey Starts from tumkur and end to Kolara");
			return 150;
		}
		return 0;
	}
		
	static boolean Transport(boolean Destination)
	{
		System.out.println("Enerted Transport ");
		System.out.println("Destination:"+Destination);
		if(Destination==true)
		{
			System.out.println("the journey Starts from Banglore and end to ballari");
			return true;
		}
		return false;
		
	}
	
	static boolean Transport(double Destination, boolean onTime)
	{
		System.out.println("Enerted Transport");
		System.out.println("Destination:"+Destination);
		System.out.println("onTime:"+onTime);
		if(Destination==450 && onTime==true)
		{
			System.out.println("the journey Starts from mysore and end to Sandur");
			return true;
		}
		return false;
	}
	
	static boolean Trans_port( boolean onTime)
	{
		System.out.println("Enerted Trans_port");
		System.out.println("onTime:"+onTime);
		if(onTime==true)
		{
			System.out.println("the journey Starts from tiptur and end to goa");
			return true;
		}
		return false;
	}
		
		

	
}