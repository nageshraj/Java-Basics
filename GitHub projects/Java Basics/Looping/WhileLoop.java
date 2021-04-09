class WhileLoop{
	public static void main(String args[]){
		String snacks[]={"masala peanuts","chips","juice","gobi","momos","khakra"};
		int i=0;
		/* while(i<snacks.length){
			System.out.println(snacks[i]);
				i++;
		} */
		
		do{
			System.out.println(snacks[i]);
			i++;
		}while(i<snacks.length);
	}
}