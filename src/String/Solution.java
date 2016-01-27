package String;

public class Solution {
	
	


    public int solution(int[] A, int X, int D) {
	 if ( D >= X )
	        return 0;
	        boolean [] position = new boolean[X] ;
	        for (int i =0 ; i< position.length ; i++)
	        {
	            position[i] = false ;
	        }
	        int current = 0;
	        int leafno = 0;
	        // write your code in noJava SE 8
	        for (int i = 0 ; i < A.length ; i++)
	        {
	            if (leafno < A[i])
	                leafno = A[i];
	            position[A[i]] = true;
	            
	            if ( current < A[i] && current + D >=  A[i])
	            {
	                current = A[i];
	            }
	            if (current + D >= X )
	            return i;
	            if ( leafno > current )
	                if( leafno - current <= D )
	                    current = leafno ;
	                else
	                    for( int j = current ; j < leafno ; j += D )
	                        for ( int k = current + 1 ; k < current+ D + 1 ;k++ )
	                            if (position[k])
	                                current = k ;
	            if (current + D >= X) 
	                return i;
	        }
	        return -1;
	        
	    }
	}


