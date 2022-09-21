class CardRunner{
	public static void main(String[] greetingcards)
	{
		System.out.println("main: evage start agide");
		
		Card.displayDetails();
		
		Card.type="weedingcard";
		Card.height=18.5;
        Card.width=15.2;
		Card.price=75;
		
		String[] choosed={"blue","black","pink","white","gray"};
        Card.colours=choosed;
		
		Card.displayDetails();
		
		System.out.println("estu bega mugidoythu");
    
        
	}
}








