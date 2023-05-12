package week3.day2.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		//comparing the length of string
		if (text1.length()==text2.length()) {
			//converting string to char
			char[] ch1 = text1.toCharArray();
			char[] ch2 = text2.toCharArray();
			//sort
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//comparing the sorted array
			boolean result = Arrays.equals(ch1, ch2);
			if (result) {
				System.out.println(text1 + " and " + text2 + " are Anagram");
				
			}
			else {
				System.out.println(text1 + " and " + text2 + " are not Anagram");
			}
		}
			

	}

}
