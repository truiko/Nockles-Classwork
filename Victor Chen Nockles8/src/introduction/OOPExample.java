package introduction;

public class OOPExample {

	public static void main(String[] args) {
		
		Student jillian = new Senior("Jillian");
		Student jordan = new Sophomore("Jordan");
		Student josh = new Junior("Josh");
		jillian.talk();	
		josh.talk();
		jordan.talk();
		
		// casting ((Subclass)jordan))
	}

}
