class MovieDataOperatorRunner
{
	public static void main(String[] show)
	{
		System.out.println("main: start aythu");
		String Temple1="chingari";
		MovieDataOperator.save(Temple1);
		
		MovieDataOperator.save("bulbul");
		MovieDataOperator.displayDetails();
		System.out.println("main: mugitha ede");
		
	}
}