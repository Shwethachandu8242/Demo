class Dress{
	
	static String color;
	static String dressName;
	static double price;
	static char size;
	static String combination;
	static String brand;
	static double priceForSet;
	static boolean availability;	
	static String length;
	static String style;
	static boolean forChildren;
	static int rating;
	static int sellingPerDay;
	static String type;
	static int Stock;
	static String Place;
	static boolean homeDelivery; 
	
	
	static String[] otherBrand;
	static String[] otherType;
	static double[] difPrices;
	static String[] otherStyle;
	static String[] availableIn;
	static String[] difColor;
	static String[] stores;
	static char[] dressSize;
	static String[] stitch;
	static String[] clothType;
	static String[] materialType;
	static String[] work;
	
	static void showDetails()
	{
		System.out.println(color);
		System.out.println(dressName);
		System.out.println(price);
		System.out.println(size);
		System.out.println(combination);
		System.out.println(brand);
		System.out.println(priceForSet);
		System.out.println(availability);
		System.out.println(length);
		System.out.println(style);
		System.out.println(forChildren);
		System.out.println(rating);
		System.out.println(sellingPerDay);
		System.out.println(type);
		System.out.println(Stock);
		System.out.println(Place);
		System.out.println(homeDelivery);
		
		if(otherBrand!=null){
			for(int position=0;position<otherBrand.length;position++)
			{
				String ref1=otherBrand[position];
				System.out.println(ref1);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(otherType!=null){
			for(int position=0;position<otherType.length;position++)
			{
				String ref2=otherType[position];
				System.out.println(ref2);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(difPrices!=null){
			for(int position=0;position<difPrices.length;position++)
			{
				double ref3=difPrices[position];
				System.out.println(ref3);
			}
		}
		else{
			System.out.println("array is zero");
			}
			
		if(otherStyle!=null){
			for(int position=0;position<otherStyle.length;position++)
			{
				String ref4=otherStyle[position];
				System.out.println(ref4);
			}
		}
		else{
			System.out.println("array is null");
			}	
		
		if(availableIn!=null){
			for(int position=0;position<availableIn.length;position++)
			{
				String ref5=availableIn[position];
				System.out.println(ref5);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(difColor!=null){
			for(int position=0;position<difColor.length;position++)
			{
				String ref6=difColor[position];
				System.out.println(ref6);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(stores!=null){
			for(int position=0;position<stores.length;position++)
			{
				String ref7=stores[position];
				System.out.println(ref7);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(dressSize!=null){
			for(int position=0;position<dressSize.length;position++)
			{
				char ref8=dressSize[position];
				System.out.println(ref8);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(stitch!=null){
			for(int position=0;position<stitch.length;position++)
			{
				String ref9=stitch[position];
				System.out.println(ref9);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(clothType!=null){
			for(int position=0;position<clothType.length;position++)
			{
				String ref10=clothType[position];
				System.out.println(ref10);
			}
		}
		else{
			System.out.println("array is null");
			}
			
		if(materialType!=null){
			for(int position=0;position<materialType.length;position++)
			{
				String ref11=materialType[position];
				System.out.println(ref11);
			}
		}
		else{
			System.out.println("array is null");
			}

		if(work!=null){
			for(int position=0;position<work.length;position++)
			{
				String ref12=work[position];
				System.out.println(ref12);
			}
		}
		else{
			System.out.println("array is null");
			}
	}
}

		
		
