package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AdvancedArrayMethods {
	
	public static void main(String[] args){
		String[] array = {"a" , "b" + "c" + "d" + "e" + "f" + "g" + "h"};
		int[] array1 = {1,0,3,4};
		int[] array2 = {1,2,3,4,5};
		//swap(array, 0, array.length - 1);
		// shuffle(array);
		System.out.println(longestSharedSequence(array1, array2 ));
	}

		
	private static void shuffle(Object[] array) {
		for(int i = 0; i < array.length; i++){
			int random = (int)(Math.random()*6);
			swap(array, i, random);
		}
		
	}
	
	public static int longestSharedSequence(int[] array1, int[] array2){
		int max = 0;
		int count = 0;
/*		for(int seqStart = 0; seqStart < array1.length; seqStart++){
			int seqEnd = seqStart;
			int[] seq = getSequence(seqStart, seqEnd, array1);
			if(checkSequence(seq, array2)){
				count++;
				if(count > max){
					max = count;
				}
			}
			// reset count after every sequence has been checked
			count = 0;
		}
*/		
		int ctr = 0;
        int longest = 0;
        for(int i = 0; i < array1.length; i++){
         for(int j = 0; j < array2.length; j++){
          if((i + ctr) < array1.length){
           if(array1[i+ctr] == array2[j]){
            ctr++;
           }
           else{
            ctr = 0;
           }
           if(ctr > longest){
            longest = ctr;
           }
          }
          
         } 
        }
        return longest;
	}
	
	// returns true if seq is found inside array2
	private static boolean checkSequence(int[] seq, int[] arr) {
		// i checks every value in arr
	A:	for(int i = 0; i < arr.length; i++){
			// j checks every element in seq
	B:		for(int j = 0; j < seq.length; j++){
				if(j + i < arr.length && seq[j] != arr[j+i]){
					// breaks out of innermost for loop unless particular for loop is 
					// specified (labels "A:") break A: break B:
					break;
				}else{
					if(j == seq.length - 1){
						return true;
					}
				}
			}
		}
		return false;
	}


	// returns a sub-array containing the elements
	// in array 1 from seqStart to seqEnd
	private static int[] getSequence(int seqStart, int seqEnd, int[] array) {
		int[] sequence = new int[(seqEnd - seqStart) + 1];
		int counter = 0;
		for(int i = seqStart; i < seqEnd + 1; i++){
			sequence[counter] = array[i];
			counter ++;
		}
		return sequence;

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
