import java.util.Scanner;

public class cas3 {
         Scanner clavier = new Scanner(System.in); /* Déclaration du scanner Instance de l'Objet Scanner 
       
          */

          System.out.println("Quel allure roulait la voiture ?"); /* Afficher votre instruction */
          a = clavier.nextDouble(); 

          System.out.println("Quel est le montant de votre salaire (par mois) ?"); /* Afficher votre instruction */
          salary = clavier.nextDouble(); 

          System.out.println("Êtes vous en cdi ?"); /* Afficher votre instruction */
          isCDI = clavier.nextBoolean(); 


          System.out.println("Combien avez-vous d'apport ?"); /* Afficher votre instruction */
          contribution = clavier.nextDouble(); 

          System.out.println("Si vous êtes déjà propriétaire d'un bien veuillez me donner sa valeur, sinon mettez 0"); /* Afficher votre instruction */
          estate = clavier.nextDouble(); 

         /* Condition 1 */
          condition1= isCDI && (salary>=3000);

         /* Condition 2 */
           condition2 = contribution >= (amount*0.25);          
           System.out.println("Apport minimum : "+amount*0.25+" euros"); /* Afficher votre instruction */
           System.out.println("Votre apport : "+contribution+" euros"); /* Afficher votre instruction */

         /* Condition 3 */
         condition3 = estate >= (amount*0.75); 
         System.out.println("75% du prêt : "+amount*0.75+" euros"); /* Afficher votre instruction */
         System.out.println("Votre bien : "+estate+" euros"); /* Afficher votre instruction */

         if(((condition1 && condition2) == true) || ((condition2 && condition3)==true)){

            
          System.out.println("Vous êtes éligible pour obtenir ce prêt de "+amount+" euros"); /* Afficher votre instruction */

         }else{

                        
          System.out.println("Vous n'êtes pas éligible pour obtenir ce prêt de "+amount+" euros"); /* Afficher votre instruction */

