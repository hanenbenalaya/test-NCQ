package algo2;

import java.util.Arrays;
import java.util.Scanner;

import algo2.Solution;

public class Test {

	public static void main(String[] args) {
		Solution solution= new Solution();
		
		int L=0;
		Scanner clavier = new Scanner(System.in);
		//Saisir N
		    while ((L <1)|| (L>50)) { 
			   System.out.print("Saisir l'entier L entre 0 et 50 : ");
	           L= Integer.parseInt( clavier.nextLine());
	          }
             System.out.println (" L : "+ L);
             System.out.println ("-------------------------------------------");
     int[] rlt = new int[L];  
        //Saisir A 
             int[] A= new int[L];
             Arrays.fill(A,0);
             System.out.println("Saisir les elements de tableau A de taille "+L+": ");
             for (int l=0;l<L; l++)
             {         

         	     while ((A[l] <1)|| (A[l]>L)) {  
         	     System.out.print(" pour l'elt "+l+" Saisir un entier compris entre 1 et "+L);
         	     A[l]= Integer.parseInt( clavier.nextLine());
         	      }
             }
         //Saisir B 
             int[] B= new int[L];
             Arrays.fill(B,0);
             System.out.println("Saisir les elements de tableau B de taille "+L+": ");
             for (int l=0;l<L; l++)
             {         

         	     while ((B[l] <1)|| (B[l]>30)) {  
         	     System.out.print(" pour l'elt "+l+" Saisir un entier compris entre 1 et 30 ");
         	     B[l]= Integer.parseInt( clavier.nextLine());
         	      }
             } 
             
           rlt=solution.solution(A,B) ;
           System.out.print (" le resultat:"+ "["+ rlt[0]+",");
			
		    for (int i=1;i<L-1; i++)
		   {System.out.print(rlt[i]+",");}
		   
			System.out.println(rlt[L-1]+"]");
             
         

	}

}
