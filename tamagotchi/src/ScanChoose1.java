import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanChoose1 {

    private static Scanner scanner;

    public static void Initialize()
    {
        scanner = new Scanner(System.in);
    }

    public static int Scan()
    {
        int num = 0;

        try {
            // ** 사용자에게 입력 안내 메시지 출력
            System.out.print("1.밥먹기 2.잠자기 3.산책 4.샤워 5.운동");
            System.out.print("행동을 선택해주세요: ");

            num = scanner.nextInt();
            scanner.nextLine();
            switch (num){
                case 1:
                    AnimalAct.food();
                    break;
                case 2:
                    AnimalAct.sleep();
                    break;
                case 3:
                    AnimalAct.walk();
                    break;
                case 4:
                    AnimalAct.shower();
                    break;
                case 5:
                    AnimalAct.excercise();
                    break;
            }
        }
        catch (NoSuchElementException e) {
            System.out.println("입력이 잘못되었습니다.");
        }
        return num;
    }
}
