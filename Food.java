class Food
{
	public static void main(String[] items)
	{
		String FoodItem1="pongal";
	    String FoodItem2="jamun";
		String FoodItem3="rasmalai";
		String FoodItem4="dosa";
		String FoodItem5="puri";
		String FoodItem6="biriyani";
		String FoodItem7="KFC_Chicken";
		String FoodItem8="Pizza";
		String FoodItem9="burger";
		String FoodItem10="pani_puri";
		String FoodItem11="jeera_rice";
		String FoodItem12="tamotobath";
		String FoodItem13="idli_vada";
		
		String[] FoodItems={FoodItem1,FoodItem2,FoodItem3,FoodItem4,FoodItem5,FoodItem6,FoodItem7,FoodItem8,FoodItem9,
		FoodItem10,FoodItem11,FoodItem12,FoodItem13};
		
		System.out.println("total FoodItemslist:"+FoodItems.length);
		
		
		for(int Food=0;Food<FoodItems.length;Food++)
		{
			System.out.println("FoodItems[Food]  :"+FoodItems[Food]);
			
		}
		System.out.println("Im replacing:"+FoodItems[3]+" & "+FoodItems[7]+" with");
		FoodItems[3] = "Mushroom Manchrian";	
		FoodItems[7] = "Paneer Tikka";
		
		System.out.println("updated 13 fooditems are as below : ");
		
		for(int Food=0;Food<FoodItems.length;Food++)
		{
			System.out.println("FoodItems["+Food+"]  :"+FoodItems[Food]);
		}
		
	}
}