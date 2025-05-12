/* EXO15 : Avec PRINT & SCANNER : Me créer un convertisseur de devise, Euros , Dollars et Livres Sterling
 *
 * Vous devriez choisir votre devise en entrée et la devise en sortie
 *
 * Attention on ne peut pas convertir les deux même devise !
 *
 * EUR : Euros
 * USD : Dollars
 * GBP : Livres Sterling
 *
 * le lien ci-dessous vous donne la valeur des monnaies : https://www.boursorama.com/bourse/devises
 *
 * ATTENTION ! : Montant doivent être décimaux , 2 chiffres après la virgule.
 *
 * **********************AFFICHAGE ATTENDU ****************:
 *
 *
 * Quel est votre monnaie ?
 *
 * EUR
 *
 * Quel est votre montant ?
 *
 * 100.00
 *
 * Vous voulez la convertir en quelle devise ?
 *
 * USD
 *
 * Résultat : 113,82 USD
 *
 *
*/
 
import java.util.Scanner;
 
public class exo15 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double EUR_TO_USD = 1.1382;  // 1 EUR = 1.1382 USD
        final double EUR_TO_GBP = 0.8580;  // 1 EUR = 0.8580 GBP
        final double USD_TO_GBP = 0.7538;  // 1 USD = 0.7538 GBP
       
        // Demander la devise d'entrée
        System.out.println("Quel est votre monnaie ?\n");
        System.out.println("EUR - Euros");
        System.out.println("USD - Dollars");
        System.out.println("GBP - Livres Sterling\n");
        String deviseEntree = scanner.nextLine().toUpperCase();
       
        // Vérifier que la devise est valide
        if (!deviseEntree.equalsIgnoreCase("eur") && !deviseEntree.equals("USD") && !deviseEntree.equals("GBP")) {
            System.out.println("Devise non reconnue. Veuillez choisir entre EUR, USD ou GBP.");
            return;
        }
       
        // Demander le montant
        System.out.println("\nQuel est votre montant ?\n");
        double montant = scanner.nextDouble();
        scanner.nextLine(); // Pour consommer le retour à la ligne
       
        // Demander la devise de sortie
        System.out.println("Vous voulez la convertir en quelle devise ?");
        String deviseSortie = scanner.nextLine().toUpperCase();
       
        // Vérifier que la devise est valide et différente de l'entrée
        if (!deviseSortie.equals("EUR") && !deviseSortie.equals("USD") && !deviseSortie.equals("GBP")) {
            System.out.println("Devise non reconnue. Veuillez choisir entre EUR, USD ou GBP.");
            return;
        }
       
        if (deviseEntree.equals(deviseSortie)) {
            System.out.println("Erreur : Vous ne pouvez pas convertir la même devise !");
            return;
        }
       
        // Conversion
        double resultat = 0;
       
        if (deviseEntree.equals("EUR")) {
            if (deviseSortie.equals("USD")) {
                resultat = montant * EUR_TO_USD;
            } else { // GBP
                resultat = montant * EUR_TO_GBP;
            }
        } else if (deviseEntree.equals("USD")) {
            if (deviseSortie.equals("EUR")) {
                resultat = montant / EUR_TO_USD;
            } else { // GBP
                resultat = montant * USD_TO_GBP;
            }
        } else { // GBP en entrée
            if (deviseSortie.equals("EUR")) {
                resultat = montant / EUR_TO_GBP;
            } else { // USD
                resultat = montant / USD_TO_GBP;
            }
        }
       
        // Afficher le résultat avec 2 décimales
        System.out.printf("\nRésultat : %.2f %s", resultat, deviseSortie);

        scanner.close();

    }
}
