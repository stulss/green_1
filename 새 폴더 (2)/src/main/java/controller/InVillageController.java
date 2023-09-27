package controller;

import java.util.*;
public class InVillageController {
    private Scanner scanner = new Scanner(System.in);
    int choice;
    public void selective(){

        System.out.println("1. 여관");
        System.out.println("2. 대장간");
        System.out.println("3. 던전 선택");
        System.out.println("4. 종료");
        System.out.println("이동하고 싶은 장소 선택");
        System.out.print("입력 : ");
        choice = scanner.nextInt();
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
        System.out.println("1. 스튜");
        System.out.println("2. 돼지고기");
        System.out.println("3. 빵");
        System.out.println("4. 잠자기");
        System.out.println("5. 마을로 나가기");
        System.out.print("입력 : ");
        choice = scanner.nextInt();
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
