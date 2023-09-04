import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//리스트는 크기를 정할수없을때 사용한다.
//균일한 속도가 보장되지 않는다.
//추가 삭제가 수월하다가.

//리스트 안에서 User의 값을 초기화하고 출력하는 프로그램 작성하기

public class MainUpdate {

    //User user = new User();

    public User user(String name,int kor, int eng, int math){
        return new User(name,kor,eng,math);
    }


    public void render() {
        List<User> arrayList = new ArrayList<User>();
        //List<User> array = new LinkedList<User>();


        arrayList.add(user("홍길동",50,60,80));
        arrayList.add(user("임꺽정",10,90,70));
        arrayList.add(user("이몽룡",90,90,90));



        /*arrayList.add(new User("홍길동",50,60,80));
        arrayList.add(new User("임꺽정",10,90,70));
        arrayList.add(new User("이몽룡",90,90,90));*/

        for(User user : arrayList){
            System.out.println("================");
            System.out.println("name = "+user.getName());
            System.out.println("Kor = "+user.getKor());
            System.out.println("Eng = "+user.getEng());
            System.out.println("Math = "+user.getMath());
            System.out.println("================");
        }


        /*User user1 = new User("홍길동",50,60,70);
        User user2 = new User("임꺽정",80,40,77);
        User user3 = new User("이몽룡",90,95,75);





        user1.setName("홍길동");
        user1.setKor(50);
        user1.setEng(60);
        user1.setMath(70);

        user2.setName("임꺽정");
        user2.setKor(80);
        user2.setEng(40);
        user2.setMath(77);

        user3.setName("이몽룡");
        user3.setKor(90);
        user3.setEng(95);
        user3.setMath(75);


        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);



        for(User user : arrayList){
            System.out.println(user1);
            System.out.println(user2);
            System.out.println(user3);

        }

        for(int i =0; i < arrayList.size(); ++i){
            System.out.println(arrayList.get(i));
        }*/


    }
}
