/* EXO19 : Avec PRINT & SCANNER :
 *
 *
 * Me créer un convertisseur de secondes au format heures : minutes : secontes
 *
 *
 *
 *  *  * **********************AFFICHAGE ATTENDU ****************:
 *
* Combien de secondes ?
 *
 * 156000
 *
 * 156 000 secondes correspond à 43 heures, 20 minutes et 0 seconde
 *
 *
 *
*/
import java.util.Scanner;
 
public class exo19 {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Combien de secondes ?");
        System.out.println();
       
        int secondesTotales = scanner.nextInt();
        System.out.println();
       
       
        int heures = secondesTotales / 3600;
        int reste = secondesTotales % 3600;
        int minutes = reste / 60;
        int secondes = reste % 60;
       
        System.out.printf("%,d secondes correspond à %d heures, %d minutes et %d seconde%s",
                          secondesTotales, heures, minutes, secondes, secondes > 1 ? "s" : "");
       
        scanner.close();
    }
}
