package State;

public class SportMode implements DrivingMode {
    @Override
    public void engage() {
        System.out.println("Mode Sport activé. Performances maximales.");
    }
    
}
