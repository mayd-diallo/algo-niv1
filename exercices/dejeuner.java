/*’ai une brique de lait (centi-litre) une quantité x
J’ai un baquet de céréal (gramme) une quantité x
J’ai un Bol (centi-litre) quantité vide
 
 
Si ma brique de lait est vide ou si mon paquet de céréal est vide
 
Alors je ne peux pas prendre mon petit déjeuner (Message)
 
Sinon
 
Je peux prendre mon petit déjeuner (Message)
J’ajoute le lait et les céréales dans le bol
 
Mon petit déjeuner est prêt (Message)*/
 


public class dejeuner {
    public static void main(String[] args) {
        int lait = 100 ;
        int cereal = 50 ;
        int bol = 0 ;
        if (lait <=0 || cereal <= 0) {
            System.out.println(" je ne peut prendre mon petit dejeuner");
            
            }else {
                System.out.println("je peut prendre mon petit dejeuner");
                bol+=lait;
                bol += cereal ;
                System.out.println("mon dejeuner est pret");
            }
    }
}
