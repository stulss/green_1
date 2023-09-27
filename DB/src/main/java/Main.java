import java.io.File;
import java.io.FileNotFoundException;
import controller.UserController;


public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();



        while(true) {
            userController.progress();
        }


    }
}
