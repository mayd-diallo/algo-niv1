/*faire un algorithme avec print & scanner permetant de boire une bouteuille d'eau d'1l en fonction de la quantité d'eau en cl si les 1l ne sont pas dépasser alors on affiche un message " il reste encore d'eau dans la bouteuille, si on depasse on affiche la bouteuille d'eau est vide" */


import java.util.Scanner;

public class BouteilleEau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int CAPACITE_BOUTEILLE = 100; // 1 litre = 100 cl
        int resteEau = CAPACITE_BOUTEILLE;
        
        System.out.println("Bouteille d'eau de 1 litre (100 cl).");
        
        while (resteEau > 0) {
            System.out.print("Combien de cl d'eau buvez-vous ? ");
            int quantiteBue = scanner.nextInt();
            
            resteEau -= quantiteBue;
            
            if (resteEau > 0) {
                System.out.println("Il reste encore " + resteEau + " cl d'eau dans la bouteille.");
            } else if (resteEau == 0) {
                System.out.println("Vous avez vidé la bouteille d'eau !");
            } else {
                System.out.println("La bouteille d'eau est vide ! Vous avez dépassé la capacité.");
                resteEau = 0; // Pour éviter les valeurs négatives
            }
        }
        
        scanner.close();
    }
}



