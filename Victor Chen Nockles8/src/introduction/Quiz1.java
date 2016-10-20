package introduction;

import java.util.Scanner;

public class Quiz1 {
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	
	// 1 point visibility private
	// 1 point for data type declaration (throughout)
	private static String username = "test_user";
	private static String password = "test";
	
	// 1 point correct method
	public static void main(String[] args){
		// 1 point for asking username once
		if(correctUser()){
			askPassword();
		}else{
			System.out.println("Unknown username, please contact the network adminstrator");
		}
	}

	private static void askPassword() {
		boolean inLoop = true;
		int triesRemaining = 3;
		// 1 point for using while loop
		while(inLoop){
			System.out.println("Enter your password.");
			// 1 point use waitForEntry() correctly
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You're in!");
				inLoop = false;
			}else{
				// 1/2 point triedRemaining is changing
				triesRemaining --;
				if(triesRemaining == 0){
					// 1/2 point printing invalid password
					System.out.println("Invalid Password.");
					// 1/2 point MAX three tries
					inLoop = false;
				}else{
					// 1/2 point printing the CORRECT number
					System.out.println("You have " + triesRemaining + " attempt(s) left.");
				}
			}
		}
		
	}

	private static boolean correctUser() {
		System.out.println("Enter a username.");
		// 1 point comparing Strings
		return waitForEntry().equals(username);
	}
}
