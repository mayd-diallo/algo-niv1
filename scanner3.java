import java.util.Scanner;

public class scanner3 {  public static void main(String[] args) {

          /***--------  Début du code  -------------------****/

          Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un premier chiffre");
        int a=sc.nextInt();
        System.out.print("entrez un second chiffre");
        int b=sc.nextInt();
        int resultat=a+b;

        if(resultat >=10){System.out.println("resultats >=10"); }
        else {System.out.println ("resultat < 10");}


        

          

          sc.close();


        /***--------  Fin du code  -------------------****/

    }

}
    
