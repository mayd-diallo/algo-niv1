/* EXO11 : Avec PRINT & Scanner , vous allez simuler un distributeur de banque :
 * 
 * Vous avez 3000€ sur votre compte, créer un algo qui retire un montant sur votre compte banquaire
 * votre solde ne peut pas être négatif
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Bonjour, combien voulez-vous retirer ?
 * 
 * 3500
 * 
 * Opération refusée, fond insuffissant !
 * 
 * 
*/


import java.util.Scanner;
public class exo11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double solde = 3000 ;
        System.out.println("combien voulez vous retirer sur votre compte ?");
        double montantretrait = scanner.nextDouble();
        if (montantretrait > solde) {
System.out.println("operation refusee, fonds insuffisant !");    
        } else {
    System.out.println("retrait effectue, nouveau solde: + solde" + "€");
 }
    scanner.close(); 
    }       
}
