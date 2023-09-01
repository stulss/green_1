import java.util.Scanner;

public class Play {
    private static Pet pet;
    private boolean flag = true;
    public void play(Pet selectPet) {
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            Pet.printInfo();
            System.out.println("1.밥먹기 2.잠자기 3.놀기 4.울기 5.때리기 그외 종료");
            System.out.println("입력 >>");
            String select = scanner.nextLine();
            switch (select) {
                case "1":
                    pet.eat();
                    break;
                case "2":
                    pet.sleep();
                    break;
                case "3":
                    pet.play();
                    break;
                case "4":
                    pet.sound();
                    break;
                case "5":
                    pet.fist();
                    break;
                default:
                    flag = false;
                    break;
            }
        }
    }
}
