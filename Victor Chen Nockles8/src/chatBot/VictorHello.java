package chatBot;

public class VictorHello implements Chatbot{

	private String helloResponse;
	private boolean inHelloLoop;
	
	private String[] calmResponses = {"We already said hello. Let's move the conversation along", 
			"You said hello already. Did you forget?"};
	private String[] angryResponses = {"Okay seriously. Stop saying hi.", "What is wrong with "
			+ "you and stop saying hello?"};
	private int helloCount;
	
	public VictorHello(){
		helloCount = 0;
	}
	
	public void talk() {
		inHelloLoop = true;
		while(inHelloLoop){
			helloCount++;
			printResponse(); // helper method
			helloResponse = VictorMain.promptInput();
			// negate use the ! 
			if(!isTriggered(helloResponse)){
				inHelloLoop = false;
				VictorMain.promptForever();
			}
		}
		
	}

	private void printResponse() {
		if(helloCount > 4){
			int responseSelection = (int) Math.random()*angryResponses.length;
			VictorMain.print(angryResponses[responseSelection]);
		}
		else{
			int responseSelection = (int) Math.random()*calmResponses.length;
			VictorMain.print(calmResponses[responseSelection]);
		}
		
	}

	public boolean isTriggered(String userInput) {
		if(VictorMain.findKeyword(userInput, "hello", 0) >= 0){
			return true;
		}
		if(VictorMain.findKeyword(userInput, "hi", 0) >= 0){
			return true;
		}
		if(VictorMain.findKeyword(userInput, "hey", 0) >= 0){
			return true;
		}
		return false;
	}
	
}
