package introduction;

public class Senior extends Student {

	public Senior(String name) {
		super(name); // constructs a Student first
		
	}
	
	public void talk(){
		super.talk();
		System.out.println("...I am a senior");
	}
}
