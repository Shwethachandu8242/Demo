class PoliticianDataOperator
{
		static String[] PoliticianNames={null,null,null};
		static int position=0;
		static void save(String PoliticianName)
		{
			System.out.println("Save: hogtha idivi");
			PoliticianNames[position]=PoliticianName;
			System.out.println("Saved PoliticianName:"+PoliticianName+" at position:"+position);
			position++;
			System.out.println("next position ref"+position);
			System.out.println("save: hogi bandvi");
			
		}
		
		static void displayDetails()
		{
			for(int temple=0;temple<PoliticianNames.length;temple++)
			{
				String ref=PoliticianNames[temple];
				System.out.println("elements:"+ref);
			}
		}
}

                    