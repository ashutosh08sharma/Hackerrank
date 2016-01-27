package Random;

import java.io.*;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		int substr = sc.nextInt();
		String smallest = inputStr.substring(0, substr);
		String largest = inputStr.substring(1, substr);

		if (inputStr.length() == substr) {
			largest = inputStr;
			smallest = inputStr;
		} else {
			for (int i = 0; i < (inputStr.length() - substr) + 1; i++) {
				// tempString=inputStr.substring(i, ()

				if (inputStr.substring(i, i + substr).compareTo(smallest) < 0) {
					smallest = inputStr.substring(i, i + substr);
				}

				if (inputStr.substring(i, i + substr).compareTo(largest) > 0) {
					largest = inputStr.substring(i, i + substr);
				}

			}
		}
		System.out.println(smallest);
		System.out.println(largest);

	}

}