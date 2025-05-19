/* EXO17 : Avec PRINT & SCANNER :
 *
 * Créer un algo qui calcule les dépenses moyenne (en euros, en France) en carburant d'une voiture en fonction
 * du type de carburant sur une distance en km.
 *
 * On consomme 6.5l / 100km pour l'essence
 * On consomme 5.5l / 100km pour le gazole
 *
 * Les prix des carburants sont sur ce lien : https://carbu.com/france/prixmoyens
 *
 * carburant par id
 *
 * Gazole (B7) = 0
 *
 * Sans Plomb 95 = 1
 *
 * Sans Plomb 98 (E5) = 2
 *
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 *
 * Quel est le type de votre carburant ?
 *
 * 0
 *
 * Vous avez choisi : Gazole
 * Quel est la distance à parcourir (en km) ?
 *
 * 150
 *
 * Pour 150 km, vous allez dépenser en moyenne 13.99€
 *
 * /!\ ATTENTION : Le résultat doit être en décimal 2 chiffres après la virgules
 *
*/
import java.util.Scanner;
 
public class exo17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Quel est le type de votre carburant ?\n");
        System.out.println("0 - Gazole (B7)");
        System.out.println("1 - Sans Plomb 95");
        System.out.println("2 - Sans Plomb 98 (E5)\n");
       
        int typeCarburant = scanner.nextInt();
       
        String nomCarburant;
        double consommation;
        double prixLitre;
       
        switch (typeCarburant) {
            case 0:
                nomCarburant = "Gazole";
                consommation = 5.5;
                prixLitre = 1.695;
                break;
            case 1:
                nomCarburant = "Sans Plomb 95";
                consommation = 6.5;
                prixLitre = 1.847;
                break;
            case 2:
                nomCarburant = "Sans Plomb 98 (E5)";
                consommation = 6.5;
                prixLitre = 1.907;
                break;
            default:
                System.out.println("Type de carburant non reconnu");
                scanner.close();
                return;
        }      
        System.out.println("\nVous avez choisi : " + nomCarburant);
        System.out.println("Quel est la distance à parcourir (en km) ?\n");
       
        double distance = scanner.nextDouble();
       
        double litresConsommes = (consommation * distance) / 100;
        double depense = litresConsommes * prixLitre;
       
        System.out.printf("\nPour %.0f km, vous allez dépenser en moyenne %.2f€\n", distance, depense);
       
        scanner.close();
    }
}
