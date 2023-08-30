/*
작성자 :
전화번호 :
*/


// Hello World 를 출력한다.
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


    }

}


/*
delete = 해제
new로 동적할당을 했으면 delete로 해제를 해줘야 한다. 안그러면 메모리누수가 일어난다.
gc = 가비지 컬렉터
 */