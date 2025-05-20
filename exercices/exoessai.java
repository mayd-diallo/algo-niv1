/*Pour vous aider voici un exemple attendu :
/** comment savoir si une variable est supérieur à 10 */
/*Variable a de Type Entier ;
A = X valeur à définir en scanner ;
Si A > 10
           Affiche  « A est supérieur à 10 »
Sinon 
           Affiche : «  A est inférieur ou égal à 10 » */

           import java.util.Scanner;

           public class exoessai{
               public static void main(String[] args) {
                   
                   Scanner scanner = new Scanner(System.in);
                   
                   
                   System.out.println("Entrez une valeur pour A: ");
                   int A = scanner.nextInt();
            
                   if (A > 10) {
                       System.out.println("A est supérieur à 10");
                   } else {
                       System.out.println("A est inférieur ou égal à 10");
                   }
                   
                
                   scanner.close();
               }
           }
           
           