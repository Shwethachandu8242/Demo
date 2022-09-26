class GraduateDataOperator
{
		static String[] GraduateNames={null,null,null};
		static int position=0;
		static void save(String GraduateName)
		{
			System.out.println("Save: hogtha idivi");
			GraduateNames[position]=GraduateName;
			System.out.println("Saved GraduateName:"+GraduateName+" at position:"+position);
			position++;
			System.out.println("next position ref"+position);
			System.out.println("save: hogi bandvi");
			
		}
		
		static void displayDetails()
		{
			for(int Branch=0;Branch<GraduateNames.length;Branch++)
			{
				String ref=GraduateNames[Branch];
				System.out.println("elements:"+ref);
			}
		}
}

                    