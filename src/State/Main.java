package State;

public class Main {
    public static void main(String[] args) {
        MercedesCar myCar = new MercedesCar();

        // Commencer en mode Eco
        myCar.setMode(new EcoMode());
        myCar.drive();

        // Changer à la volée vers le mode Sport
        myCar.setMode(new SportMode());
        myCar.drive();

        // Changer à la volée vers le mode Confort
        myCar.setMode(new ComfortMode());
        myCar.drive();
    }
}