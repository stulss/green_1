import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanChoose {

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
            System.out.print("1.고양이\n2.개");
            System.out.print("동물을 선택해주세요: ");


            switch (num){
                case 1:
                    Cat cat = new Cat();
                    break;
                case 2:
                    Dog dog = new Dog();
                    break;
            }

        } catch (NoSuchElementException e) {
            System.out.println("입력이 잘못되었습니다.");
        }
        return num;
    }
}
