/* EXO3 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition (types entiers) et vérifier si elle est pair ou impaire     
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resultat = 5
 * 
 * resultat est impaire
 * 
 * 
 * 
 * 
*/
import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();
        int resultat = a + b;
        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        System.out.println("\nresultat = a + b");
        System.out.println("\nresultat = " + resultat);
        if (resultat % 2 == 0) {
            System.out.println("\nresultat est pair");
        } else {
            System.out.println("\nresultat est impair");
        }
        
        scanner.close();
    }

    
}