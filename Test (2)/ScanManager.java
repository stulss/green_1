import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanManager {

    private static Scanner scanner;

    public static void Initialize()
    {
        scanner = new Scanner(System.in);
    }

    public static int Scan()
    {
        int num = 0;

        try {
            num = scanner.nextInt();
            scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("입력이 잘못되었습니다.");
        }

        return num;
    }
}
