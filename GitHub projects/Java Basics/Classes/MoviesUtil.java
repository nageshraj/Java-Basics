class MoviesUtil{
	public static void main(String a[]){
		Movies movie= new Movies();
		movie.name= "KGF2";
		movie.lang= "Kannada";
		movie.rating= 4.5;
		
		System.out.println(movie.name+" "+movie.lang+" "+ movie.rating);
		
		Movies kish= movie;
		kish.name="Pogaru";
		
		System.out.println(movie.name+" "+movie.lang+" "+ movie.rating);
		System.out.println(kish.name+" "+kish.lang+" "+ kish.rating);
	}
}