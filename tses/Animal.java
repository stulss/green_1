import java.util.Scanner;
public class Animal {

    public void makeSound(){
        System.out.println("동물이 소리를 냅니다.");
    }

}



class Dog extends Animal{
    //여기서는 Animal 클래스의 makeSound 메서드를 그대로 사용할 수 있다.
    public  void makeSound(){
        System.out.println("멍멍!");
    }
}

class Cat extends Animal{
    //부모 클래스의 makeSound 메서드를 오버라이딩
    public  void makeSound(){
        System.out.println("야옹!");
    }
}

