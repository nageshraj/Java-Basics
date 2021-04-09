class MobileUtil{
	public static void main(String a[]){
		Mobile mob= new Mobile();
		mob.brand="Nokia";
		mob.name="6.1 plus";
		mob.price=16000.00f;
		mob.ram= 8;
		mob.megapixels=12;
		
		System.out.println(mob.brand+" "+mob.name+" "+mob.price+" "+mob.ram+" "+mob.megapixels);
		mob.cameraClick();
		
	}
}