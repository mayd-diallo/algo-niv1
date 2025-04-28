/* EXO5 : A l'aide de Scanner et Print, créer une équation  A multiplier par B diviser C (tous types entiers) , récupérer le résultat et vérifier si elle inférieur ou supérieur à 10
 * 
 * 
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * equation = (EQUATION)
 * 
 * equation = 15
 * 
 * 
 * equation est superieur
 * 
*/
import java.util.Scanner;
public class exo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("entrez le premier entier");
        int a =scanner.nextInt();
        System.out.println("entrez un second entier");
        int b = scanner.nextInt();
        System.out.println("entrez un troisiéme entier");
        int c = scanner.nextInt();
        int resultat = a * b / c ;
        if (resultat > 10) {
            System.out.println(+ resultat + " est supérieur à 10");
        } else {
            System.out.println(+ resultat + " est inférieur à 10");
            }
            scanner.close();
 
    }
}