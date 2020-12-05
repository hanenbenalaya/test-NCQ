package algo3;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Solution solution= new Solution();
		int Sol ;
		int N=0;
		Scanner clavier = new Scanner(System.in);
		//Saisir N
		    while ((N <1)|| (N>20)) { 
			   System.out.print("Saisir l'entier N entre 0 et 20 : ");
	           N = Integer.parseInt( clavier.nextLine());
	          }
             System.out.println (" N : "+ N);
             System.out.println ("-------------------------------------------");
        //Saisir A 
             int[] A= new int[N];
             Arrays.fill(A,-200);
             System.out.println("Saisir les elements de tableau A de taille "+N+": ");
             for (int l=0;l<N; l++)
             {         

         	     while ((A[l] <(-100))|| (A[l]>100)) {  
         	     System.out.print(" pour l'elt "+l+" Saisir un entier compris entre -100 et 100 ");
         	     A[l]= Integer.parseInt( clavier.nextLine());
         	      }
             }
         
         

      

         System.out.println ("--------resultat-------");
         Sol=solution.solution(A);
         System.out.println (Sol);


	}
}
