package caspratiquejalon;
import java.util.Scanner;

/*Avec Print & Scanner : Me faire un code qui convertit un prix HT (Hors Taxe) en prix TTC 

(Toute taxe comprise) à l’aide de la TVA (en pourcentage) que vous pourrez changer à votre guise  */

public class HTversTTC {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Entrez le prix HT (en euros): ");
        double prixHT = scanner.nextDouble();
        
        
        System.out.print("Entrez le taux de TVA (en %): ");
        double tauxTVA = scanner.nextDouble();
        
        
        
    
        double prixTTC = prixHT * (1 + tauxTVA / 100);
        
        scanner.close();
    }
}