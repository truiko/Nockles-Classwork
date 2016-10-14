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
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school", "class", "teacher"};
		// idea: create a for loop to iterate through your array of triggers
		
		if(VictorMain.findKeyword(userInput, "school", 0) >= 0){
			return true;
		}
		if(VictorMain.findKeyword(userInput, "class", 0) >= 0){
			return true;
		}
		return false;
	}
	
}
