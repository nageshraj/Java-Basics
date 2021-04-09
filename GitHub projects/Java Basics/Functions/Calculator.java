class Calculator{
	void add(int a, int b){
		System.out.println(a+b);
	}
	void sub(){
		int a=5,b=2;
		System.out.println(a-b);
	}
	
	int sub(int b){
		int a=5;
		return a-b;
	}
		
	int add(int a,int b, int c){
		return a+b+c;
	}
	
	void mul(float a,float b){
		System.out.println(a*b);
	}
	
	float mul(float a, float b, float c){
		return a*b*c;
	}
	
	public static void main(String args[]){
		Calculator obj= new Calculator();
		int answer1= obj.add(5,4,3);
		float answer2= obj.mul(5.0f,4.0f,3.0f);
		obj.add(2,3);
		obj.mul(2.0f,3.0f);
		obj.sub();
		int answer3 = obj.sub(3);
		System.out.println(answer3);
		
	}
}
		