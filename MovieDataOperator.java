class MovieDataOperator
{
		static String[] MovieNames={null,null,null};
		static int position=0;
		static void save(String MovieName)
		{
			System.out.println("Save: hogtha idivi");
			MovieNames[position]=MovieName;
			System.out.println("Saved MovieName:"+MovieName+" at position:"+position);
			position++;
			System.out.println("next position ref"+position);
			System.out.println("save: hogi bandvi");
			
		}
		
		static void displayDetails()
		{
			for(int actor=0;actor<MovieNames.length;actor++)
			{
				String ref=MovieNames[actor];
				System.out.println("elements:"+ref);
			}
		}
}

                    