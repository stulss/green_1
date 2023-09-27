import controller.InVillageController;

public class Main {
    public static void main(String[] args) {
        InVillageController inVillageController = new InVillageController();

        while(true) {
            inVillageController.selective();
        }
    }
}