import java.util.Scanner;

public class SelectPet {
    public Pet selectPet(){
        Scanner scanner = new Scanner(System.in);
        Pet returnValue = null;
        System.out.println("캐릭터를 선택하세요");
        System.out.println("1.고양이\n2.개");
        String ch = scanner.nextLine();

        switch (ch){
            case "1":
                returnValue = new Cat();
                break;
            case "2":
                returnValue = new Dog();
                break;
        }
        return returnValue;
    }
}
