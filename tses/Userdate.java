import java.util.*;
class User {

    private String name;



    private String getName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해 주세요.");
        String name = scanner.nextLine();


        return name;
    }
}