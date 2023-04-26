package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElement {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		//Sorting Array
		Arrays.sort(arr);
		//For Loop
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i+1]-arr[i]!=1) {
				System.out.println(arr[i]+1);
				
			}
			
		}

	}

}
