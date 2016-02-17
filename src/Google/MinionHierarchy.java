package Google;

import java.util.Scanner;

public class MinionHierarchy {
	

	Scanner sc =new Scanner(System.in);
	String x= sc.nextLine();
	
	    public static int answer(int x) {
	    	int result =1;
	    	
	        for(int i=0;i<x;i++){  
	        	result = (result*7)+1;
	        	
	    		}
	        System.out.println(result);
			return result;
			 
			
	}
	


public static void main(String args[]){
	
answer(2);

}

}