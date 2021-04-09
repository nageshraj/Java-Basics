class ForLoop{
	public static void main(String a[]){
		String snacks[]={"masala peanuts","chips","juice","gobi","momos","khakra"};
		for(int i=0;i<snacks.length;i++)
		{
			if(i%2 == 0)
				continue;
			System.out.println(snacks[i]);
		}
	}
}