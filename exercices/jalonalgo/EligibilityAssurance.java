/*faire un algorithme avec print & scanner qui permet de tester si vous êtes éligible ou non à la suite d'un accident sur l'autoroute pour le remplacement de votre véhicule selon votre assureur en fonction des conditions suivantes :
 * rouler à 130 km/h; ne pas être placer derrière le véhicule, entrer en collission ; si vous avez plus de 150000 km au compteur, votre contrôle technique doit dater maximun 2 ans ; si vous avez moins de 150000 km au conteur votre contrôle technique doit dater maximun 5 ans
 */
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class EligibilityAssurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demande des informations
        System.out.println("Vérification d'éligibilité au remplacement de véhicule après accident");
<<<<<<< HEAD
        System.out.println();
=======
        System.out.println("---------------------------------------------------------------");
>>>>>>> f3613617499527047a176d57e6d06ad4c6264f08
        
        // Vitesse au moment de l'accident
        System.out.print("Rouliez-vous à 130 km/h au moment de l'accident? (oui/non): ");
        String vitesse = scanner.nextLine().toLowerCase();
        
        // Position par rapport à l'autre véhicule
        System.out.print("Étiez-vous placé derrière l'autre véhicule? (oui/non): ");
        String position = scanner.nextLine().toLowerCase();
        
        // Type de collision
        System.out.print("Y a-t-il eu une collision avec l'autre véhicule? (oui/non): ");
        String collision = scanner.nextLine().toLowerCase();
        
        // Kilométrage
        System.out.print("Quel est le kilométrage de votre véhicule? (en km): ");
        int km = scanner.nextInt();
        scanner.nextLine(); // Pour consommer la ligne vide
        
        // Date du dernier contrôle technique
        System.out.print("Date du dernier contrôle technique (AAAA-MM-JJ): ");
        String dateCTStr = scanner.nextLine();
        LocalDate dateCT = LocalDate.parse(dateCTStr);
        LocalDate aujourdhui = LocalDate.now();
        long ageCT = Period.between(dateCT, aujourdhui).toTotalMonths() / 12;
        
        // Vérification des conditions
        boolean eligible = true;
        
        // Condition 1: vitesse à 130 km/h
        if (!vitesse.equals("oui")) {
            System.out.println("- Vous ne rouliez pas à 130 km/h");
            eligible = false;
        }
        
        // Condition 2: ne pas être placé derrière
        if (position.equals("oui")) {
            System.out.println("- Vous étiez placé derrière l'autre véhicule");
            eligible = false;
        }
        
        // Condition 3: collision
        if (!collision.equals("oui")) {
            System.out.println("- Il n'y a pas eu de collision");
            eligible = false;
        }
        
        // Condition 4: contrôle technique selon kilométrage
        if (km > 150000) {
            if (ageCT > 2) {
                System.out.println("- Contrôle technique de plus de 2 ans pour véhicule >150000 km");
                eligible = false;
            }
        } else {
            if (ageCT > 5) {
                System.out.println("- Contrôle technique de plus de 5 ans pour véhicule ≤150000 km");
                eligible = false;
            }
        }
        
        // Résultat final
        System.out.println("\nRésultat de l'évaluation:");
        if (eligible) {
            System.out.println("Félicitations! Vous êtes éligible au remplacement de votre véhicule.");
        } else {
            System.out.println("Désolé, vous ne remplissez pas les conditions pour le remplacement de votre véhicule.");
        }
        
        scanner.close();
    }
}

