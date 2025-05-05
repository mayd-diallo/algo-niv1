package entrainement;

import java.util.Scanner;

public class condition {
 public static void main(String[] args) {
        System.out.println();
        Scanner clavier = new Scanner(System.in);
        int a ;
        System.out.println("entrez une valeur entier");
        
    
        a = clavier.nextInt();
        System.out.println("message:"+ a);
        clavier.close() ;
    
    if (a>=10) {
        System.out.println("la valeur est superieur a 10");
    }
    else {
        System.out.println("la valeur est inférieur a 10");


    }
}
}
