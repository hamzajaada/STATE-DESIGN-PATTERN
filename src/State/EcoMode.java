package State;

public class EcoMode implements DrivingMode {
    @Override
    public void engage() {
        System.out.println("Mode Eco activé. Économie de carburant maximale.");
    }
}
