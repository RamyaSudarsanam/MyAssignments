package week3.day2.assignments;

public class ChangeoddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] ch = test.toCharArray();
		for (int i = 0; i < test.length(); i++) {
			ch[i] = test.charAt(i);
		}
		for (int j = 0; j < ch.length; j++) {
		if (j%2==0) {
			System.out.print(ch[j]);
		}
			else {
			System.out.print(Character.toUpperCase( ch[j] ));
			}
		}	
			
		}	
		}
