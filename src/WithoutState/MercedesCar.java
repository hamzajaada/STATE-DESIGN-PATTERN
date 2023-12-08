package WithoutState;

public class MercedesCar {
    private boolean ecoMode;
    private boolean sportMode;
    private boolean comfortMode;

    public MercedesCar() {
        // Initialiser avec le mode Eco par défaut
        this.ecoMode = true;
        this.sportMode = false;
        this.comfortMode = false;
    }

    public void setEcoMode() {
        ecoMode = true;
        sportMode = false;
        comfortMode = false;
    }

    public void setSportMode() {
        ecoMode = false;
        sportMode = true;
        comfortMode = false;
    }

    public void setComfortMode() {
        ecoMode = false;
        sportMode = false;
        comfortMode = true;
    }

    public void drive() {
        if (ecoMode) {
            System.out.println("Mode Eco activé. Économie de carburant maximale.");
        } else if (sportMode) {
            System.out.println("Mode Sport activé. Performances maximales.");
        } else if (comfortMode) {
            System.out.println("Mode Confort activé. Conduite en douceur.");
        } else {
            System.out.println("Aucun mode sélectionné.");
        }
    }
}