package algo3;


public class Solution {
	 public int val(int[] A,int[] S) {
		 int x=0;
		 for (int i = 0; i < A.length; i++) {
			 x+=A[i]*S[i];
		 }
		 return x;
	 }
	public int solution(int[] A){
        if(A.length == 0) return 0;
        int [] S = new int[A.length];
        int sum = 0;
        if(-A[0]>A[0]){
            S[0] = 1;

        }else{
            S[0]= -1;
        }
        sum  = S[0] * A[0];
        for(int i=1;i<A.length;i++){
            if(Math.abs(sum - A[i])>Math.abs(sum + A[i])){
                S[i] = 1;
            }else{
                S[i] = -1;
            }
            sum+=S[i]*A[i];
        }
        return Math.abs(val(A,S));
    }
	}

