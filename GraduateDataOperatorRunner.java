class GraduateDataOperatorRunner
{
	public static void main(String[] validity)
	{
		System.out.println("main: start aythu");
		String  Graduate1="VrundaDarling cs&e 8";
		GraduateDataOperator.save(Graduate1);
		
		GraduateDataOperator.save("Yashwanth civil 7.8");
		GraduateDataOperator.displayDetails();
		System.out.println("main: mugitha ede");
		
	}
}