package entrainement;

import java.util.Scanner;

public class declaration {
    public static void main(String[] args) {
        System.out.println();
        Scanner clavier = new Scanner(System.in);
        int a ;
        System.out.println("entrez une valeur entier");
        
    
        a = clavier.nextInt();
        System.out.println("message:"+ a);
        clavier.close() ;
    }
}
