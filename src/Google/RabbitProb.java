package Google;

import java.util.Arrays;
import java.util.Scanner;

public class RabbitProb {

	public static String[] answer(String[] names) {
		return names;

	}
	private static int getnumericValue(char c) {
		return Character.getNumericValue(c - 9);
	}
	private static int getnamevalue(String name) {
		int value = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			value += getnumericValue(c);
		}
		return value;
	}
	public int compare(String s1, String s2){
	int v1 = getnamevalue(s1);
	int v2 = getnamevalue(s2);
	 if (v1>v2){
		 return -1;
		 
	 if(v2>v1){
		 return 1;
	
		 if(v1 == v2){
			 int ls1 = s1.length();
			 int ls2 = s2.length();
			 int len = ls1 > ls2 ? ls2 : ls1;
			 	for(int i = 0; i < len; i++){
			 		int lexcompare1 = getnumericValue(s1.charAt(i));
			 		int lexcompare2 = getnumericValue(s2.charAt(i));
			 			if(lexcompare2 > lexcompare1) {
			 				return 1;
			 			} else if (lexcompare1 > lexcompare2) {
			 					return -1;
         }
     }
 }

 return 0;

 }
}
	}
