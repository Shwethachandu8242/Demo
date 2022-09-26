class FoodItemsDataOperatorRunner
{
	public static void main(String[] validity)
	{
		System.out.println("main: start aythu");
		String FoodItem1="rasmalai";
		FoodItemsDataOperator.save(FoodItem1);
		
		FoodItemsDataOperator.save("jamun");
		FoodItemsDataOperator.displayDetails();
		System.out.println("main: mugitha ede");
		
	}
}