package chatBot;

public class VictorSchool implements Chatbot{
	private boolean inSchoolLoop;
	private String schoolResponse;
	public void talk(){
		inSchoolLoop = true;
		while(inSchoolLoop){
			VictorMain.print("(Type quit to go back.)");
			// static call on promptInput method from VictorMain class
			schoolResponse = VictorMain.promptInput();
			if(schoolResponse.indexOf("quit") >= 0){
				inSchoolLoop = false;
				VictorMain.promptForever();
			}
			VictorMain.print("That's my favorite part about school");
		}
	}
}
