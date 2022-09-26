class PoliticianDataOperatorRunner
{
	public static void main(String[] validity)
	{
		System.out.println("main: start aythu");
		String Temple1="kumaraswamy";
		PoliticianDataOperator.save(Temple1);
		
		PoliticianDataOperator.save("indiraGandhi");
		PoliticianDataOperator.displayDetails();
		System.out.println("main: mugitha ede");
		
	}
}