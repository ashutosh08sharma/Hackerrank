package String;

public class StringCompression {

	    public String compress(String str){
	        int count = 1;
	        StringBuilder builder = new StringBuilder();

	        for(int i = 1; i<str.length(); i++){

	            if(str.charAt(i) == str.charAt(i-1) && i < str.length()-1){
	                count++;
	            }
	            
	            else if(i == str.length()-1 && str.charAt(i) == str.charAt(i-1)){
	                count++;
	                builder.append(str.charAt(i));
	                builder.append(count);
	            }
	            else if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
	                builder.append(str.charAt(i-1));
	                builder.append(count);
	                count = 1;
	                builder.append(str.charAt(i));
	                builder.append(count);
	            }
	            else{
	              
	                builder.append(str.charAt(i-1));
	                builder.append(count);
	                count = 1;
	            }

	        }

	        str = builder.toString();
	        System.out.println(str);

	        return str;
	    }

	  
}
