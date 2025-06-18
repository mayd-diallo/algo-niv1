 
import java.util.Scanner;

public class exo7avecfonction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Do you speak english (Y/N)?");
        System.out.println();
        
        String response = scanner.nextLine().trim().toUpperCase();
        
        if (response.equals("Y")) {
            System.out.println("\"Nice to meet you\"");
        } else if (response.equals("N")) {
            System.out.println("\"So learn english !\"");
        } else {
            System.out.println("Invalid response. Please answer with Y or N.");
        }
        
        scanner.close();
    }
}