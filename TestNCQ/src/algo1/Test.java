package algo1;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	static void increase(int x , int[] y){
	   	 
		   y[x-1]++;
		  
	        }
	 static  void increaseMax( int[] y){
		 int valmax = Arrays.stream(y).max().getAsInt();
         Arrays.fill(y,valmax);
		         
		       }
	
public static void main(String[] args) {
		 Solution solution=new Solution();
		int N=0  ;
		int M=0 ; 
		Scanner clavier = new Scanner(System.in);
        
		//saisir N  
		    while ((N <1)|| (N>100)) { 
			    System.out.print("Saisir l'entier N entre 1 et 100 : ");
	             N = Integer.parseInt( clavier.nextLine());
	            }
             System.out.println (" N : "+ N );
             System.out.println ("-------------------------------------------");
      //Saisir M
            while ((M<1)|| (M>100)) { 
			  System.out.print("Saisir l'entier M entre 1 et 100 : ");
	          M= Integer.parseInt( clavier.nextLine());
	           }
    
               System.out.println (" M : "+ M);
        
       int[] counter= new int[N];
	   //Saisir A		  
            int[] A= new int[M];
            System.out.println("Saisir les elements de tableau A de taille "+M+": ");
             for (int i=0;i<M; i++)
              {
	           while ((A[i] <1)|| (A[i]>N+1)) {  
	              System.out.print(" pour l'elt "+i+" Saisir un entier compris entre 1 et N+1 ");
	                A[i]= Integer.parseInt( clavier.nextLine());
	            }
               }
      System.out.println ("tableau rempli");
      System.out.println ("------------*****-------------");

 	
		 counter=solution.solution(N, A) ; 	 
		 
		    System.out.print ("finalement le compteur  devient :"+ "["+ counter[0]+",");
			
		    for (int i=1;i<N-1; i++)
		   {System.out.print(counter[i]+",");}
		   
			System.out.println(counter[N-1]+"]");

	 

	}



}
