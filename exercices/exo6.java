/* EXO6 : A l'aide de Scanner et Print, donnez moi votre prénom et votre âge, pour l'affichage sous la forme d'une phrase dynamique
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * prenom = "Eudes"
 * 
 * age = 32
 * 
 * Je m'appelle Eudes , j'ai 32 ans
 * 
 * 
 * 
*/import java.util.Scanner;
public class exo6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("prenom = ");
        String prenom = scanner.nextLine();
        
        System.out.print("\nage = ");
        int age = scanner.nextInt();
        
        System.out.println("\nJe m'appelle " + prenom + ", j'ai " + age + " ans");
        
        scanner.close();
    }
}