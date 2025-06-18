/*: A l'aide des fonctions et tableau en java, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
 *  mot de passe et confirmer votre mot de passe (ils doivent être identiques). Si les mots de passes ne sont pas identiques, ceci affiche "inscription annulée"
 * Sinon vous affichez le message suivant ci-dessous :
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Votre prénom ?
 * 
 * Eudes
 * 
 * Votre nom ?
 * 
 * Konda
 * 
 * Votre adresse email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * confirmer votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * Merci Eudes KONDA , votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : ekonda@arfp.asso.fr
 *  */
import java.util.Scanner;

public class FormulaireInscription {
    
    // Tableau pour stocker les informations de l'utilisateur
    private static String[] informations = new String[5];
    // Constantes pour les indices du tableau
    private static final int PRENOM = 0;
    private static final int NOM = 1;
    private static final int EMAIL = 2;
    private static final int MDP = 3;
    private static final int CONFIRM_MDP = 4;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander les informations
        demanderInformation("Votre prénom ?", PRENOM, scanner);
        demanderInformation("\nVotre nom ?", NOM, scanner);
        demanderInformation("\nVotre adresse email ?", EMAIL, scanner);
        demanderInformation("\nvotre mot de passe ?", MDP, scanner);
        demanderInformation("\nconfirmer votre mot de passe ?", CONFIRM_MDP, scanner);
        
        // Vérifier les mots de passe
        if (verifierMotsDePasse()) {
            afficherConfirmation();
        } else {
            System.out.println("\nInscription annulée");
        }
        
        scanner.close();
    }
    
    // Méthode pour demander une information et la stocker dans le tableau
    private static void demanderInformation(String message, int index, Scanner scanner) {
        System.out.println(message + "\n");
        informations[index] = scanner.nextLine();
    }
    
    // Méthode pour vérifier que les mots de passe sont identiques
    private static boolean verifierMotsDePasse() {
        return informations[MDP].equals(informations[CONFIRM_MDP]);
    }
    
    // Méthode pour afficher la confirmation d'inscription
    private static void afficherConfirmation() {
        String prenom = informations[PRENOM];
        String nom = informations[NOM].toUpperCase();
        String email = informations[EMAIIL];
        
        System.out.println("\nMerci " + prenom + " " + nom + 
                         ", votre inscription a bien été effectuée, " +
                         "vous recevrez un mail de confirmation à l'adresse : " + email);
    }
}