/* EXO13 : Avec PRINT & SCANNER : Convertir du centimètre (Entier) au mètre (Double)
 * 
 ***********************AFFICHAGE ATTENDU ****************/
/* Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 * 
 * Donner une taille en centimètre ?
 * 
 * 170
 * 
 * 170 cm vaut 1.70 m
 */


import java.util.Scanner;
public class exo13 {

    public static void main(String[] args) {
        
        System.out.println("Donner une taille en centimètre ?");
        System.out.println();
        
        int centimetres = Scanner.nextInt();
        double metres = centimetres / 100.0;
        
        System.out.println();
        System.out.println(centimetres + " cm vaut " + metres + " m");
        
        Scanner.close();
    }
}



