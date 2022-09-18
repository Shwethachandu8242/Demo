class FoodItemList{
	
	public static void main(String[] favFood)
	{
		System.out.println("Im printing 13 fooditems : ");
		
		String favFood1 = "Akki Rotti"; 	String favFood2 = "Tatte Idly";
		String favFood3 = "Masala Dosa"; 	String favFood4 = "upma";
		String favFood5 = "pani puri"; 		String favFood6 = "Carrot Halwa";
		String favFood7 = "Gulab Jamoon";	String favFood8 = "Methi Pulao";
		String favFood9 = "Omlet";			String favFood10= "Orange Juice";	
		String favFood11= "Butter Fruit Juice"; 	String favFood12= "Vangi Bath";		
		String favFood13= "Chapathi";
		
		
		String[] MyFavFood ={favFood1,favFood2,favFood3,favFood4,favFood5,favFood6,favFood7,favFood8
							,favFood9,favFood10,favFood11,favFood12,favFood13};
		
		System.out.println("favFoods are: "+MyFavFood.length);
		
		for(byte foodIndex = 0; foodIndex<MyFavFood.length; foodIndex++)
		{
			System.out.println("MyFavFood["+foodIndex+"]  :"+MyFavFood[foodIndex]);
		}
		
		// Now Im updating the array 
		System.out.println("Im replacing---------->>>>:"+MyFavFood[3]+" & "+MyFavFood[7]+" with");
		
		MyFavFood[3] = "Mushroom Manchrian";		MyFavFood[7] = "Paneer Tikka";
		
		System.out.println("--------------------->>>>>"+MyFavFood[3]+" & "+MyFavFood[7]);
		
		System.out.println("updated 13 fooditems are as below : ");
		
		for(byte foodIndex = 0; foodIndex<MyFavFood.length; foodIndex++)
		{
			System.out.println("MyFavFood["+foodIndex+"]  :"+MyFavFood[foodIndex]);
		}
		
	
		
		
		
	}
}