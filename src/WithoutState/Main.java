package WithoutState;

public class Main {
    public static void main(String[] args) {
        // Créer une instance de MercedesCar
        MercedesCar myMercedes = new MercedesCar();

        // Afficher l'état initial
        System.out.println("État initial de la voiture :");
        myMercedes.drive();

        // Changer le mode à Eco
        myMercedes.setEcoMode();
        System.out.println("\nChangement au mode Eco :");
        myMercedes.drive();

        // Changer le mode à Sport
        myMercedes.setSportMode();
        System.out.println("\nChangement au mode Sport :");
        myMercedes.drive();

        // Changer le mode à Confort
        myMercedes.setComfortMode();
        System.out.println("\nChangement au mode Confort :");
        myMercedes.drive();
    }
}

