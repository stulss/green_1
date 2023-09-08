import java.util.Scanner;

public class MakeCharacter {


    public Character selectCharacter(){
        Scanner scanner = new Scanner(System.in);
        Character returnValue = null;
        System.out.println("캐릭터를 선택하세요");
        System.out.println("1.아구몬\n2.파피몬");
        String ch = scanner.nextLine();

        switch (ch){
            case "1":
                returnValue = new AguMon();
                break;
            case "2":
                returnValue = new PapiMon();
                break;
        }
        return returnValue;
    }
}

