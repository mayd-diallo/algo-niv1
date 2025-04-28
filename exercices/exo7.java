/* EXO7 : A l'aide de Scanner et Print, créer un questionnaire, "Do you speak english ?", répondre yes ou no, puis retourner le messages suivants 
 * 
 * si FALSE "So learn english !"
 * 
 * Si TRUE "Nice to meet you"
 * 
 * **********************AFFICHAGE ATTENDU ****************:
 * 
 * Do you speak english (Y/N)?
 * 
 * Y (Tapez Y)
 * 
 * "Nice to meet you"
 * 
 * 
 * 
*/import java.util.Scanner;

public class exo7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Do you speak english (Y/N)?");
        System.out.println();
        
        String response = scanner.nextLine().trim().toUpperCase();
        
        if ("Y".equals(response)) {
            System.out.println("\"Nice to meet you\"");
        } else if ("N".equals(response)) {
            System.out.println("\"So learn english !\"");
        } else {
            System.out.println("Please answer with Y or N.");
        }
        
        scanner.close();
    }
}