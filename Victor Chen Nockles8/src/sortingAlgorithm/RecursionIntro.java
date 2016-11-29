package sortingAlgorithm;

public class RecursionIntro {

	public static void main(String[] args){
//		System.out.println("Using a for loop:");
//		for(int i = 0; i < 5; i++){
//			System.out.println("Hello world! x"+ i);
//		}
//		System.out.println("Without using a for loop:");
//		forLoop(5, new Action() {
//			private int value = 0;
//			public void act() {
//				System.out.println("Hello world! x" + value);
//				value++;
//			}
//		});
//		factorial(5);
		
		hanoiSolution(4, "A", "B", "C");
		
	}

	private static void forLoop(int i, Action action) {
		if(i <= 0){
			// base case
			return;
		}else{
			// standard action
			action.act();
			// recursive call
			forLoop(i-1, action);
		}
		
	}
	
	public static int factorial(int num){
		// for loop method
		for(int i = num - 1; i > 0; i--){
			num = num * i;
		}
		System.out.print(num);
		return num;
		
		// recursion method
//		if(num > 1){
//			return num * factorial(num-1);
//		}
//		return 1;
	}
	
	public static void hanoiSolution(int numberOfDiscs, 
			String startPeg, 
			String midPeg, 
			String endPeg){
		if(numberOfDiscs <= 1){
			System.out.println("Move " + startPeg + " to " + endPeg);
		}else{
			hanoiSolution(numberOfDiscs-1, startPeg, endPeg, midPeg);
			hanoiSolution(1,startPeg,midPeg,endPeg);
			hanoiSolution(numberOfDiscs-1, midPeg, startPeg, endPeg);
		}
	}
}
