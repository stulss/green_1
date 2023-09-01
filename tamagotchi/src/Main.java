import java.util.Scanner;

/*  작성자 : 배준혁
 */
public class Main {

    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);

        Tamagochi tamagochi = Tamagochi.getInstance();
        int choose=1;
        while (choose!=0){
            System.out.println("번호를 눌러 행동해주세요!");
            System.out.println("1 : 샤워하기\t" +
                    "2 : 산책가기\t" +
                    "3 : 밥주기\t" +
                    "4 : 잠자기\n" +
                    "5 : 운동하기\t" +
                    "6 : 상태\t" +
                    /*"7 : \n" +
                    "8 : \n" +
                    "9 : \n" +
                    "10 : \n" +
                    "\t0 : 게임 종료!\n");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    tamagochi.shower();
                    break;
                case 2:
                    tamagochi.walk();
                    break;
                case 3:
                    System.out.println("1 : 밥\n" +
                            "2 : 간식\n" +
                            "3 : 특식\n");
                    choose = scanner.nextInt();
                    switch (choose){
                        case 1:
                            tamagochi.Strv(1);
                            break;
                        case 2:
                            tamagochi.Strv(2);
                            break;
                        case 3:
                            tamagochi.Strv(3);
                        default:
                            System.out.println("그런 요리는 없어요!");
                            continue;
                    }
                    break;
                case 4:
                    tamagochi.sleep();
                    break;
                case 5:
                    tamagochi.excercise();
                    break;

                case 6:
                    tamagochi.status();
                    break;
/*                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 0:
                    break;
*/
  /*              default:
                    choose=0;
                    System.out.println("게임을 종료합니다. ");
                    break;
            }
        }*/


        Play pg = new Play();
        SelectPet sp = new SelectPet();
        Pet selectPet= sp.selectPet();
        pg.play(selectPet);



    }
}