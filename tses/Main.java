/*
작성자 :
전화번호 :
*/


// Hello World 를 출력한다.
/*
public class Main {
    public static void main(String[] args) {

        User user = new User();

        String name = new String("홍주형");
        int age = 22;
        String password = new String("123123");
        user.setName(name);
        user.setPassword(password);
        user.setAge(age);
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        System.out.println(user.getAge());


        User user = new User();
        System.out.println(user.getAddress().num1);
        System.out.println(user.getAddress().num2);
        System.out.println(user.getAddress().num3);

    }

}
*/

/*
delete = 해제
new로 동적할당을 했으면 delete로 해제를 해줘야 한다. 안그러면 메모리누수가 일어난다.
gc = 가비지 컬렉터
 */


public class Main {

    public static void main(String[] args) {

        /*
        Singleton.getInstance().setNumber(10);
        int number = Singleton.getInstance().getNumber();

        System.out.println(number);
        */







/*




        Manager manager = null; //new Manager();

        Manager.number = 10;
        manager.num=10;

        // 생성자 호출 및 초기화
        User user = new User("홍길동","111222333",24);

        System.out.println(Manager.number);

        User.gerName();
        System.out.println(Manager.number);

        //위에서 초기화된 내용을 각각 받아옴.
        String name = user.getName();
        String password = user.getPassword();
        int age = user.getAge();

        // 비교 연산 수행 및 값 변경
        name = "임꺽정";

        // 새로운 값 셋팅
        user.setName(name);

        //System.out.println(user.getName());
        user.render();
*/

    }






    /*
    public static void main(String[] args) {
        //Animal 객체 생성 : Animal 클래스에서 함수를 호출합니다.
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  //출력 : "동물이 소리를 냅니다."

        //Dog 객체 생성 : Dog 클래스에 함수를 호출합니다.
        Dog mydog = new Dog();
        mydog.makeSound();  // 출력 : "멍멍"

        //Cat 객체 생성
        Cat myCat = new Cat();
        myCat.makeSound();  //출력 : "야옹!"
    }
     */
}