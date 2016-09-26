package chatBot;

import java.util.Scanner;

public class VictorMain {
	static String response;
	static boolean inMainLoop;
	static Scanner input;
	static String user;
	// list all the chatbots available under this class
	static Chatbot school;

	public static void main(String[] args) {
		// demonstrateStringMethods();
		createFields();
		promptName();
		// promptInput();
		promptForever();
	}
	
	public static void promptName() {
		print("Enter your name.");
		user = input.nextLine();
		print("Glad to meet you, " + user + ". For the rest of time, I will call you, " + user 		+ ". You may call me Computer." + " We should become friends. ");
	}

	public static void promptForever() {
		inMainLoop = true;
		while(inMainLoop){
			print("Hi, " + user + ". How are you?");
			response = promptInput();
			if(findKeyword(response, "good", 0) >= 0){
				print("That's wonderful." + "So glad you feel good.");
			}
			// response to liking school
			else if(response.indexOf("school") >= 0){
				print("School is great. Tell me about school.");
				// exit this while loop
				inMainLoop = false;
				// got to the school's talk method
				school.talk();
			}
			else{
				print("I don't understand.");
			}
		}
		
	}

	public static int findKeyword(String searchString, String keyword, int startPosition) {
		// delete white space
		searchString = searchString.trim();
		// make lower case
		searchString = searchString.toLowerCase();
		keyword = keyword.toLowerCase();
		// first position of key word
		int position = searchString.indexOf(0);
		while(position >= 0){
			// assume preceeded and followed by space
			String before = " ";
			String after = " ";
			// check character in front if it exists
			if(position > 0){
				before = searchString.substring(position - 1, position);
			}
			// check if there is a character after the keyword
			if(position + keyword.length() < searchString.length()){
				after = searchString.substring(position + keyword.length(), position + 				keyword.length() + 1);
			}
		}
		return -1;
	}

	public static String promptInput() {
		String userInput = input.nextLine();
		return userInput;
	}

	public static void createFields() {
		input = new Scanner(System.in);
		user = "";
		school = new VictorSchool();
		
	}
	
	public static void demonstrateStringMethods(){
		
		String text1 = new String("Hello World");
		String text2 = "Hello World"; // same as above
		if(text1.equals(text2)){
			print("These strings are equal:");
		}
		print(text1);
		print(text2);
		
		String word1 = "Aardvark";
		String word2 = "Zyzzyva";
		
		if(word1.compareTo(word2) < 0){
			print("word1 comes before word2");
		}
		
	}
	public static void print(String s){
		String printString = "";
		int cutoff = 35;
		// check for words to add
		// in other words, s had a length > 0
		while(s.length() > 0){
			String cut = "";
			String nextWord = "";
			// check to see if the next word will fit on the line
			// and there must still be words to add
			while(cut.length() + nextWord.length() < cutoff && s.length() > 0){
				// add the next word to the line
				cut += nextWord;
				s = s.substring(nextWord.length());
				
				// identify the following word without the space
				int endOfWord = s.indexOf(" ");
				// if there are no more spaces
				// this is the last word, so add the whole thing
				if(endOfWord == -1){
					endOfWord = s.length() - 1; // -1 for index
				}
				nextWord = s.substring(0, endOfWord + 1);
			}
			printString += cut + "\n";
		}
		System.out.println(printString);
	}
}

