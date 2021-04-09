class Area{
	void area(){
		System.out.println("Area cannot be calculated");
	}
	
	int area(int a){
			return a*a;
		}
		
		int area(int a, int b){
			return a*b;
		}
		
	public static void main(String a[]){
		Area obj = new Area();
		
		
		System.out.println(obj.area(5));
		System.out.println(obj.area(5,10));
		obj.area();
		
	}
}