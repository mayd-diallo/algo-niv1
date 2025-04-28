/* EXO8 : A l'aide de Scanner et Print, créer un formulaire d'inscription, où on vous demande de renseignez, votre prénom, votre nom, adresse email,
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
 * Votre adresse ?
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
 * 
*/

import java.util.Scanner;


public class exo8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander les informations
        System.out.println("Votre prénom ?\n");
        String prenom = scanner.nextLine();
        
        System.out.println("Votre nom ?\n");
        String nom = scanner.nextLine();
        
        System.out.println("Votre adresse email ?\n");
        String email = scanner.nextLine();
        
        System.out.println("Votre mot de passe ?\n");
        String motDePasse = scanner.nextLine();
        
        System.out.println("Confirmer votre mot de passe ?\n");
        String confirmationMotDePasse = scanner.nextLine();
        
        // Vérifier si les mots de passe correspondent
        if (!motDePasse.equals(confirmationMotDePasse)) {
            System.out.println("Inscription annulée");
        } else {
            // Afficher le message de confirmation
            System.out.println("Merci " + prenom + " " + nom.toUpperCase() + 
                               ", votre inscription a bien été effectuée, vous recevrez un mail de confirmation à l'adresse : " + email);
        }
        
        scanner.close();

}


}
