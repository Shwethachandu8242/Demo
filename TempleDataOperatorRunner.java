class TempleDataOperatorRunner
{
	public static void main(String[] templeeee)
	{
		System.out.println("main: start aythu");
		String Temple1="AnjaneyaTemple";
		TempleDataOperator.save(Temple1);
		
		TempleDataOperator.save("GaneshaTemple");
		TempleDataOperator.displayDetails();
		System.out.println("main: mugitha ede");
		
	}
}