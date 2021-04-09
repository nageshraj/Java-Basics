class WrapperConversion{
	static String num="8762228856";
	static String num2="123.45";
	static Integer num3 = 123;
	
	
	public static void main(String a[]){
		WrapperConversion wc = new WrapperConversion();
		long ph=Long.parseLong(num);
		System.out.println(ph);
		
		char[] ch = num.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]+" ");

		float fl = Float.parseFloat(num2);
		System.out.println(num2);

		// byte by = Byte.parseByte(num3); // Incompatible conversion
		// System.out.println(by);



	
		
	}
}