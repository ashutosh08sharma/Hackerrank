package Hackerrank;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1;i>=0;i--){
        	B+=A.charAt(i);
            
        }
        boolean result =A.equals(B);
        if(result){
            System.out.println("Yes");
        }else{
               System.out.println("No");
            }
        }
    }




