package arrays;

public class AdvancedArrayMethods {
	
	public static void main(String[] args){
		String[] array = {"a" , "b" + "c" + "d" + "e" + "f" + "g" + "h"};
		//swap(array, 0, array.length - 1);
		shuffle(array);
	}

		
	private static void shuffle(Object[] array) {
		for(int i = 0; i < array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i, random);
		}
		
	}


	private static void swap(Object[] array, int a, int b) {
		Object placeHolder = array[a];
		array[b] = array[a];
		array[a] = placeHolder;
		
	}

	private static void methodA(int[] someArray) {
		int[] newArray = new int[someArray.length];
		copyArray(newArray, someArray);
		
	}
	
	public static void copyArray(int[] original, int[] target){
		if(original.length == target.length){
			for(int i = 0; i < original.length; i++){
				target[i] = original[i];
			}
		}else{
			// print error message
			System.out.println("ERROR: tried to copy arrays of two different lengths");
		}
	}
}
