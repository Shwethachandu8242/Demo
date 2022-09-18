class InternetUsage{
	public static void main(String[] apps)
	{
		double whatsapp=500.85;
		double facebook=100.23;
		double youtube=280.44;
		double instagram=450.50;
		double teligram=800.90;
		
		double[] InternetUsage={whatsapp,facebook,youtube,instagram,teligram};
		double dailyusage=InternetUsage.length;
		System.out.println("total usage:"+dailyusage);
		
		double ref0=InternetUsage[0];
		double ref1=InternetUsage[1];
		double ref2=InternetUsage[2];
		double ref3=InternetUsage[3];
		double ref4=InternetUsage[4];
		System.out.println("element index:"+ref0);
		System.out.println("element index:"+ref1);
		System.out.println("element index:"+ref2);
		System.out.println("element index:"+ref3);
		System.out.println("element index:"+ref4);
	}
}