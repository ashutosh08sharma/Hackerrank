package Hackerrank;

import java.io.*;
import java.util.*;

public class SyntaxChecker
{

    public static void main(String[] args)
    	{
       /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    		Scanner sc = new Scanner(System.in);
    		int t=sc.nextInt();
    		int a= sc.nextInt();
    		int b= sc.nextInt();
    		int n= sc.nextInt();
    		
    		for(int i=t; t<=500;i++)
    		{
    			System.out.println(i);
    		 if(a<=50)
    		 {
    			 if(b<=50)
    			 {
    				if(n<=15)
    				{
    					System.out.println(a+" "+b+" "+n);
    				}
    				else{
    					System.out.println("Error");
    					}
    			 } 
    		 }
    		
    
    		}
    		
    	}
}
    