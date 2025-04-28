/* EXO9 : La suite de l'EXO 8, une fois l'inscription terminé, essayez de vous connecter en donnant l'email et le mot de passe correspondant.
 * 
 * Si l'email ou le mot de passe n'est pas vous afficher "connexion refusée"
 * 
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
 * Pour vous connecter, renseignez votre email ?
 * 
 * ekonda@arfp.asso.fr
 * 
 * Renseignez votre mot de passe ?
 * 
 * ekonda123&!
 * 
 * 
 *
*/
import java.util.Scanner;
public class exo9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrez vortre inscription");
        System.out.print("entrez votre mail");
        String email = scanner.nextLine();
        System.out.println("entrez votre mot de passe");
        String mot de passe = scanner.nextLine();
        if ("mot de passe correct";"mot de passe incorrect") {
            System.out.println("connexion réussi");
        } else {
            System.out.println("connexion échouée");
        scanner.close();
        }
    }
}