package week3.day2.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.testng.annotations.IFactoryAnnotation;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] words = text.split(" "); // [We, learn, java,..]
		for (int i = 0; i < words.length-1; i++) {//We
				for (int j = i+1; j < words.length - 1; j++) {//learn
					if (words[i].equals(words[j])) {
						words[j]="";
						count++;
					}
					
				}	
		}
				
		if(count>1)		{
			for (int k = 0; k <= words.length-1; k++) {
				System.out.print(words[k] + " " );
		}
		}
		
				
			}
			
		
			
	}



