package Random;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;


public class treeSet {
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);
	String inputStr = sc.next();
	int substr = sc.nextInt();
	TreeSet<String> tset= new TreeSet<String>();
	for(int i=0;i<(inputStr.length()-substr)+1;i++){
	 tset.add(inputStr.substring(i,i+substr));
	}
	
	 System.out.println(tset.first());
	 System.out.println(tset.last());
}
}