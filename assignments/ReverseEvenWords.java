package week3.day2.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] a = test.split(" "); //I, am, a, software, tester
		
		for (int i = 0; i <= a.length-1; i++) {
	if (i % 2 != 0) {
		char[] charArray = a[i].toCharArray(); //a, m, s,o
		for (int j = charArray.length - 1; j >= 0; j--) { //m, a,
			System.out.print(charArray[j] );
		}
	}
	else {
		System.out.print(" "+a[i]+" ");
	}
	
		}
		
			}
		}


