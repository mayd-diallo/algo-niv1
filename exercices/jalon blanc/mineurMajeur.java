package caspratiquejalon;
/*Exo1: Avec Print & Scanner : Me faire un code qui permet de savoir si une personne est mineur 

(-18 ans) ou majeur (+18 ans)  */

import java.util.Scanner;



public class mineurMajeur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrez votre âge");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("vous etes mineur.");
        } else {
            System.out.println("vous etes majeur");

            Scanner close;
        } 
    }
}
