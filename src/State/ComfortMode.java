package State;

public class ComfortMode implements DrivingMode {
    @Override
    public void engage() {
            System.out.println("Mode Confort activé. Conduite en douceur.");
    }
}
