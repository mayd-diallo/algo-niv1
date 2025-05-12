// exo 12 : avec Print & Scanner, vous aller me créer un algo "qui applique une réduction (en pourcentage %) sur un prix (en decimal) donnée :"

import java.util.Scanner;

public class exo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("quelle est Votre prix ?");
        double prixInitial = scanner.nextDouble();
        
        System.out.println("quelle est Votre réduction (en pourcentage %) ?");
        int reduction = scanner.nextInt();
        
        double prixReduit = prixInitial * (1 - reduction / 100.0);
        
        System.out.println("Prix après réduction de " + reduction + "% = : "+prixReduit+" EUR");
        
    } Scanner close ;
}
