class FoodItemsDataOperator
{
		static String[] FoodItemNames={null,null,null};
		static int position=0;
		static void save(String FoodItemName)
		{
			System.out.println("Save: hogtha idivi");
			FoodItemNames[position]=FoodItemName;
			System.out.println("Saved FoodItemName:"+FoodItemName+" at position:"+position);
			position++;
			System.out.println("next position ref"+position);
			System.out.println("save: hogi bandvi");
			
		}
		
		static void displayDetails()
		{
			for(int variety=0;variety<FoodItemNames.length;variety++)
			{
				String ref=FoodItemNames[variety];
				System.out.println("elements:"+ref);
			}
		}
}

                    