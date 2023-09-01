import java.util.Scanner;


public class PlayGame {
    private static Character character;
    private boolean flag = true;

    public void play(Character c){
        character=c;
        Scanner scanner = new Scanner(System.in);
        while (flag){
            character.printInfo();
            System.out.println("1.밥먹기 2.잠자기 3.놀기 4.운동 5.종료");
            System.out.println("입력 >>");
            String select = scanner.nextLine();
            switch (select){
                case "1":
                    character.eat();
                    break;
                case "2":
                    character.sleep();
                    break;
                case "3":
                    character.play();
                    break;
                case "4":
                    character.train();
                    break;
                case "5":
                    flag = false;
                    break;
                default:
                    break;
            }
            character.levelUP();
            if(flag = true){
                flag = character.endGame();
            }
        }
    }
}
