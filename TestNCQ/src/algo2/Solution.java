package algo2;

import java.util.Arrays;

public class Solution {
	 public int Cofbinomial(int n,int k){
	        // Base Cases
	        if (k > n)
	            return 0;
	        if (k == 0 || k == n)
	            return 1;

	        // Recursive
	        return Cofbinomial(n - 1, k - 1)+ Cofbinomial(n - 1, k);
	    }
	    public int[] solution(int[] A,int[] B){
	        int[] rlt = new int[A.length];
	        Arrays.fill(rlt,0);
	        for(int i = 0;i<A.length;i++){
	            for(int j=0;j<A[i];j++){
	                    rlt[i]+=Cofbinomial(A[i]-j,j);

	                if(rlt[i]>2*B[i]){
	                    rlt[i] = rlt[i]%(2*B[i]);
	                }
	            }

	        }
	        return rlt;
	    }

}
