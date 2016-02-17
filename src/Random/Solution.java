package Random;

public class Solution {

	public static void main(String[] args) {
		int n = 6;
		char[][] a = new char[n][n];
           for(int i = 0; i < n; i++){
               for(int j = n-1; j >= 0; j--){
            	   
                   if(i < j) {
                       a[i][j] = ' ';
                       System.out.print(a[i][j]);
                     
                   }
                   else {
                	   a[i][j] = '#';
                	   System.out.print(a[i][j]);
                   }
               }
               System.out.print("\n");
           }
           
           /*for(int i = 0; i < n; i++){
               for(int j = 0; j <n; j++){
                   System.out.print(a[i][j]);
               }
           }*/
        
	}

}
