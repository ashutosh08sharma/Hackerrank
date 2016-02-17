package Anaagram;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Anagram {

	static boolean isAnagram(String A, String B) {
		
		char a[]=A.toLowerCase().toCharArray(); 
		char b[]=B.toLowerCase().toCharArray();
		
		 Arrays.sort(a);
		   Arrays.sort(b);

		   return Arrays.equals(a,b);
		
	}
			/*	if (A.length() != B.length()) {

			return false;
		} 
				else {
			ArrayList<String> arr = new ArrayList<String>();
			String temp= A;
			for (int i = 0; i < A.length(); i++) {

				for (int j = 0; j < A.length(); j++) {
				
					if (A.charAt(i) == B.charAt(j)) {
						
					}

				}

			}
			/*Set<Entry<Character, Integer>> entry = map.entrySet();
			for (Entry<Character, Integer> str : entry) {
				if(str.getValue() > 1){
					return false;
				}
			} 
			// Complete the function
			return true;

		}

	}
	*/

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		boolean ret = isAnagram(A, B);
		if (ret)
			System.out.println("Anagrams");
		else
			System.out.println("Not Anagrams");

	}

}