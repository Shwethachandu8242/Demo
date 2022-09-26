class TempleDataOperator
{
		static String[] TempleNames={null,null,null};
		static int position=0;
		static void save(String TempleName)
		{
			System.out.println("Save: hogtha idivi");
			TempleNames[position]=TempleName;
			System.out.println("Saved TempleName:"+TempleName+"at position:"+position);
			position++;
			System.out.println("next position ref"+position);
			System.out.println("save: hogi bandvi");
			
		}
		
		static void displayDetails()
		{
			for(int temple=0;temple<TempleNames.length;temple++)
			{
				String ref=TempleNames[temple];
				System.out.println("elements:"+ref);
			}
		}
}

                    