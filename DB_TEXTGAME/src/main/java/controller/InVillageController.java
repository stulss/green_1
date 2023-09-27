package controller;

import java.util.*;
public class InVillageController {
    private Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    public void selective(){

        scanner.nextLine();

        switch(choice){
            case 1:
                pub();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }

    public void pub(){
        scanner.nextLine();
        switch(choice){
            case 1:
                System.out.println("스튜를 먹었다");
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
    }

}
