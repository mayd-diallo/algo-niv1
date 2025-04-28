/* EXO4 : A l'aide de Scanner et Print, tester si une valeur(type entier) est divisible par 2   
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * 
 * a = 14
 * 
 * 
 * a est bien divisible par 2
 * 
 * 
*/import java.util.Scanner;

public class exo4{
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("a = ");
        int a = scanner.nextInt();
        
        
        if (a % 2 == 0) {
            System.out.println("\na est bien divisible par 2");
        } else {
            System.out.println("\na n'est pas divisible par 2");
        }
        
    
        scanner.close();
    }
}

