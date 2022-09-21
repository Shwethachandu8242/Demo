class DressRunner{
	public static void main(String[] Anarkali)
	{
		System.out.println("main: nodta idivi");
		
		Dress.showDetails();
		
		Dress.color="red";
		Dress.dressName="chudi";
		Dress.price=1239.9;
		Dress.size='s';
		Dress.combination="retroWithModren";
		Dress.brand="Trends";
		Dress.priceForSet=2000;
		Dress.availability=true;
		Dress.length="full";
		Dress.style="modern";
		Dress.forChildren=false;
		Dress.rating=4;
		Dress.sellingPerDay=25;
		Dress.type="fullSleeves";
		Dress.Stock=30;
		Dress.Place="Rajajinagar";
		Dress.homeDelivery=false;
		
		String[] ary1={"H&M","Ramaraj"};
		Dress.otherBrand=ary1;
	
		String[] ary2={"halfSleeves","sleeveLess"};
		Dress.otherType=ary2;
	
		double[] ary3={800,650,1200};
		Dress.difPrices=ary3;
	
		String[] ary4={"jeans","EthnicWear"};
		Dress.otherStyle=ary4;
	
		String[] ary5={"India","UK"};
		Dress.availableIn=ary5;
	
		String[] ary6={"Blue","white"};
		Dress.difColor=ary6;
	
		String[] ary7={"chankies","colours"};
		Dress.stores=ary7;
	
		char[] ary8={'s','l'};
		Dress.dressSize=ary8;
	
		String[] ary9={"double","single"};
		Dress.stitch=ary9;
	
		String[] ary10={"short","long"};
		Dress.clothType=ary10;
	
		String[] ary11={"satin","cotton"};
		Dress.materialType=ary11;
	
		String[] ary12={"embroidory","plane"};
		Dress.work=ary12;
	
		Dress.showDetails();
	
	System.out.println("main: mugitu");
}


}