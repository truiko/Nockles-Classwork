package arrays;

public class ArraysPractice {

	static boolean[] boos3; 
	
	public static void main(String[] args) {
		
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
