/* EXO1 : A l'aide de Scanner et Print, me faire afficher le résultat d'une addition de deux entiers        
 * 
 * 
* **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a + b
 * 
 * resulat vaut 5
 * 
 * 
 * 
*/import java.util.Scanner;

public class exo1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();
        
        int resultat = a + b;
        
        System.out.println("\nresultat = a + b");
        System.out.println("\nresultat vaut " + resultat);
        
        scanner.close();
    }
}

