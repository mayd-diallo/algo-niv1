/* EXO18 : Avec PRINT & SCANNER :
 *
 *
 * Vous souvenez de l'exercice d'algèbre de Boole de la banque ? Une banque vous accorde un prêt immobilier
 * si vous répondez aux critères suivants :
 *
 * condition 1 : Avoir un CDI avec un salaire de plus 3000€
 *
 * condition 2 : Avoir un apport de 25% de la somme demandé
 *
 * condition 3 (Si la condition 1 n'est pas rempli ) : Avoir une autre propriété
 * valant minimum 75% du prêt demandé
 *
 *
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 *
    * Quel est le montant de votre prêt ?
 *
 * 150000
 *
 * Êtes-vous en CDI ?
 *
 * TRUE
 *
 * Combien avez-vous d'abord ?
 *
 * 1500
 *
 * Vous ne pouvez pas hélas obtenir de prêt !
 
 *
*/
public class exo18 {
   
    public static void main(String[] args) {
        Scanner scanner = new scanner(System.in); 
        System.out.println("Bienvenue dans le simulateur de prêt immobilier");
        
        System.out.println("Avez-vous un CDI ? (true/false) : ");
        boolean aUnCDI = scanner.nextBoolean();
        
        System.out.println("Quel est votre salaire mensuel ? (en €) : ");
        double salaire = scanner.nextDouble();
        
        System.out.println("Quel est le montant du prêt demandé ? (en €) : ");
        double montantPret = scanner.nextDouble();
        
        System.out.println("Quel est votre apport personnel ? (en €) : ");
        double apport = scanner.nextDouble();
        
        System.out.println("Avez-vous une autre propriété ? (true/false) : ");
        boolean aUneAutrePropriete = scanner.nextBoolean();
        
        System.out.println("Si oui, quelle est sa valeur ? (en €, mettez 0 si non applicable) : ");
        double valeurPropriete = scanner.nextDouble();
  
        
        boolean condition1 = aUnCDI && salaire >= 3000;
        boolean condition2 = apport >= 0.25 * montantPret;
        boolean condition3 = !condition1 && aUneAutrePropriete && (valeurPropriete >= 0.75 * montantPret);
        
        boolean pretAccorde = condition1 && condition2 || condition3;
  
        System.out.println("\nRésultat de l'analyse :");
        System.out.println("Condition 1 (CDI + salaire >= 3000€) : " + condition1);
        System.out.println("Condition 2 (Apport >= 25%) : " + condition2);
        System.out.println("Condition 3 (Alternative si pas condition 1) : " + condition3);
        
        if (pretAccorde) {
            System.out.println("\nFélicitations ! Votre prêt immobilier est accordé.");
        } else {
            System.out.println("\nDésolé, votre prêt immobilier ne peut pas être accordé.");
        }
  
        scanner.close();
    }
 }
