package introduction;

public class Sophomore extends Student {

	String favoriteGenre;
	String[] genres = {"Science-fiction", "Horror" };
	
	public Sophomore(String name) {
		super(name);
		favoriteGenre = genres[0] ;
	}
	
	public void talk(){
		
		System.out.println("My favorite genre is " + favoriteGenre);
	}

}
