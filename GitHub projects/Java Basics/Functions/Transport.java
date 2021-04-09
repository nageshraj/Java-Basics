class Transport{
	
	/* void travel(){
	System.out.println("travel");
	}
	
	void travel(String type){
		System.out.println(type);
	}
	*/
	
	String travel(){
		System.out.println("Travelling");
		return "test";
	}
	
	String travel(String type){
		System.out.println(type);
		return type;
	}
	

	public static void main(String args[]){
		Transport t= new Transport();
		String s= t.travel();
		System.out.println(s);
		String s1= t.travel("bus");
		System.out.println(s1);
	}
}