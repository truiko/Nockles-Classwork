package arrays;

public class ArraysPractice {

	static boolean[] boos3; 
	
	public static void main(String[] args) {
		
		listPrimes(120);
		// how do you time a process
/*		long currentTime = System.currentTimeMillis();
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers, 50);
		print(fiftyNumbers);
		rollDice(fiftyNumbers, 4);
		print(fiftyNumbers);
		// count each die roll and provide a percentage
		countResult(fiftyNumbers, 4);

		
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime - currentTime) + " ms.");
		
*/
	}
	
	private static void listPrimes(int limit) {
		int lastToCheck = (int) (Math.sqrt(limit));
		boolean[] numbers = new boolean[limit + 1];
		for(int i = 0; i < limit + 1; i++){
			numbers[i] = true;
		}
		
		// 0 and 1 are, by definition, not prime
		numbers[0] = false;
		numbers[1] = false;
		
		// check all non-"crossed of" numbers (start with 2)
		for(int prime = 2; prime <= lastToCheck; prime++){
			if(numbers[prime]){
				System.out.println("\n" + prime + " is prime." + " Crossing off:");
				for(int i = (int)(Math.pow(prime,2)); i < limit+1; i += prime){
					System.out.print(i + ", ");
					numbers[i] = false;
				}
			}
		}
		// print the primes
		System.out.print("\n The primes are:");
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index]){
				System.out.print(index + ", ");
			}
			
		}
	}

	
	
	private static void countResult(int[] array, int numberOfDice) {
		System.out.println("Count Result");
		int[] counter = new int[numberOfDice*6];
		for(int n: array){
			counter[n-1] = counter[n - 1] + 1;
		}
		for(int i = numberOfDice - 1; i < counter.length; i ++){
			System.out.println((i+1) + " was rolled " + 100*counter[i]/array.length + " percent of the time");
		}
	}

	private static void rollDice(int[] array, int numberOfDice) {
		System.out.println("Roll Dice");
		for(int i = 0; i < array.length; i++){
			int dice = 0;
			for(int j = 0; j < numberOfDice; j ++){
				dice = (int)(dice + (1+6*Math.random()));
			}
			array[i] = dice;
		}
	}

	private static void randomize(int[] array , int max) {
		System.out.println("Randomize");
		for(int i = 0; i < array.length; i++){
			int random = (int)(Math.random()*max) + 1;
			array[i] = random;
		}
		
	}

	private static void print(int[] array) {
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
		
	}

	private static void populate(int[] array) {
		System.out.println("Populate");
		for(int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		
	}

	private void demonstratePassByValue(){
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		someStrings[999] = getASpecialString();
		print(someStrings);
	}
	
	private static String getASpecialString() {
		return "THIS STRING IS SPECIAL!";
	}

	private static void makeSpecial(String s) {
		s = "THIS STRING IS SPECIAL!";
		
	}

	private static void print(String[] s) {
		for(int i = 0; i < s.length; i++){
			System.out.println(s[i]);
		}
		
	}

	private static void standardPopulate(String[] s) {
		for(int i = 0; i < s.length; i++){
			s[i] = "String # " + (i+1);
		}
		
	}

	public static void initializingArraysExample(){
		// two different ways to instatiate an array
				boolean[] boos1 = new boolean[3];
				//this can only be done at the declaration
				//because it sets size and content:
				boolean[] boos2 = {false,false,false};
				//this does not work
				// boos3 = {false,true,true};
				// this is all that will work
				boos3 = new boolean[3]; 
				
				/** 2 ways of iterating through an array
				 STANDARD FOR LOOP
				 	- the index is important to keep track of 
				 	- you need to customize the order
				*/
				for(int i = 0; i < boos1.length; i++){
					System.out.println(boos1[i]);
				}
				/**
				 * "FOR - EACH" LOOP
				 * 		- the index is not important
				 * 		- you don't need to customize
				 * 		- automatically assigns a handle
				 * 		- faster to write
				 */
				 for(boolean b: boos1){
					 System.out.println(b);
				 }
				 
				 // OBJECT ARRAYS
				 String[] someStrings1 = new String[3];
				 // don't manually instantiate the array. it is repetitive
				 String[] someStrings2 = {"a" + "b" + "c"};
				 
				 // try a loop to instantiate instead:
				 for(int i = 0; i < someStrings1.length; i++){
					 someStrings1[i] = "a new String";
				 }
				 // a loop to print it
				 for(String s: someStrings1){
					 System.out.println(s);
				 }
	}
	

}
