package Hackerrank;

import java.util.Scanner;


public class StringTokenizer{

public static void main(String args[])
{
    Scanner scan = new Scanner(System.in);
    String inputstr=scan.nextLine();
    inputstr= inputstr.trim();
      
if(inputstr.length()>400000){
	System.out.println();
}
else if(inputstr.length()==0){
		
	System.out.println("0"); 
	}
	else{
		
		StringTokenizer st = new StringTokenizer(inputstr,"!,?._'@ ");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens())
		{
		    System.out.println(st.nextToken());
		}
	}
  }
}
