package introduction;

public class RandomDiceRoll {

	public static void main(String[] args) {
		int[] results = new int[6];
		System.out.println(results[0]);
		// declare variable, logic test, and increment
		for(int index = 0; index < 10; index++){
			int result = rollFairDie();
			System.out.println("Roll #" + (index + 1) + ": " + result);
			results[result-1] ++;
		}
		
		//print the results
		for(int i = 0; i < 6; i++){
			System.out.println((i+1) + " appeared " + results[i] + " times." );
		}
	}
	
	// return 1,2,3,4,5,6 with equal probability
	public static int rollFairDie(){
		double rand = Math.random(); // returns a double (0,1)
		int roll = (int) (6*rand); // [0,5]
		roll++; // [1,6]
		return roll;
	}
	
	/*public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = (int) (6*rand);
		double unfair = Math.random();
		boolean fair = false;
		
		if(unfair >= .5){
			fair = false;
		}
		else{
			fair = true;
		}
		if(fair == false){
			if(roll < 3)
			{
				return roll++;
			}
		}
		System.out.println(fair);
		return roll;
	}
	*/
		 
}
