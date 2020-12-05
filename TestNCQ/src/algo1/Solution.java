package algo1;

import java.util.Arrays;

public class Solution {
	public void increase(int x , int[] y){
	   	 
		   y[x-1]++;
		  
	        }
	public  void increaseMax( int[] y){
		 int valmax = Arrays.stream(y).max().getAsInt();
      Arrays.fill(y,valmax);
		         
		       }
	public int[] solution(int N,int[]A){
		int[] counter =new int[N];
		Arrays.fill(counter,0);
		
		for (int i=0;i<N; i++)
		   {
			if ((A[i]>=1)&&(A[i]<=N)) 
			   {increase(A[i],counter);
			  }  
			
			else if (A[i]==N+1) {
				increaseMax(counter);
				}
		   }    	 
		  return counter;
		    
		
	}

}
