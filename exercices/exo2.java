/* EXO2 : A l'aide de Scanner et Print, me faire afficher le résultat d'une soustraction (types entiers) et vérifier si elle est inférieur à 0    
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * a = 2
 * b = 3
 * 
 * resultat = a - b
 * 
 * resultat = -1
 * 
 * resutat est inférieur à 0
 * 
 * 
 * 
 */import java.util.Scanner;

public class exo2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        System.out.print("b = ");
        int b = scanner.nextInt();
        
        System.out.println();
        
        int resultat = a - b;
        
        System.out.println("resultat = a - b");
        System.out.println();
        System.out.println("resultat = " + resultat);
        System.out.println();
        
        if (resultat < 0) {
            System.out.println("resultat est inférieur à 0");
        } else {
            System.out.println("resultat est supérieur ou égal à 0");
        }
        
        scanner.close();
    }
}