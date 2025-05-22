/*faire un algorithme avec print & scanner qui me permet de calculer le salaire net à partir de du salaire brute. Pour vous aider en france vous avez 23% de charge sociale sur le salaire brute */

import java.util.Scanner;

public class CalculSalaireNet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double CHARGES_SOCIALES = 0.23; // 23% de charges
        
        // Demander le salaire brut
        System.out.print("Entrez votre salaire brut (en euros) : ");
        double salaireBrut = scanner.nextDouble();
        
        // Calcul du salaire net
        double salaireNet = salaireBrut * (1 - CHARGES_SOCIALES);
        
        // Affichage des résultats
        System.out.println("\nVotre salaire brut est de " + salaireBrut + " euros.");
        System.out.println("Après déduction des charges sociales (23%),");
        System.out.println("votre salaire net est de " + salaireNet + " euros.");
        
        scanner.close();
    }
}
