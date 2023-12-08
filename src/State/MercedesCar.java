package State;

public class MercedesCar {
    private DrivingMode currentMode;

    void setMode(DrivingMode mode) {
        this.currentMode = mode;
    }

    void drive() {
        currentMode.engage();
    }
}
