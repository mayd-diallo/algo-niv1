/*Exo2 : Avec Print & Scanner : Me faire un code qui transfert de l’argent d’un compte A à un 

compte B ,  */

import java.util.Scanner;

public class transferdargent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soldecompteA = 1000.0 ;
        double soldecompteB = 500.0 ;
        
    
        System.out.print("Entrez le montant à transférer du compte A vers le compte B: ");
        double montant = scanner.nextDouble();
        
    
        if (montant <= 0) {
            System.out.println("Le montant doit être positif!");
        } else if (montant > soldecompteA) {
            System.out.println("Solde insuffisant sur le compte A!");
        } else {
        
            soldecompteA -= montant;
            soldecompteB += montant;
            
            System.out.println("\nTransfert effectué avec succès!");
            System.out.printf("Nouveau solde compte A: %.2f €\n", soldecompteA);
            System.out.printf("Nouveau solde compte B: %.2f €\n", soldecompteB);
        }
        
        scanner.close();
    } 
}
  

