package String;

public class ReverseString {
	
 public String reverseWords(String s) 
 {
String reverse = new StringBuilder(s).reverse().toString();
System.out.println(reverse);
return reverse;
        
    }
}


