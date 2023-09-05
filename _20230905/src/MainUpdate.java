import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainUpdate {

    public User createUser(String name, int kor, int eng, int math){
        return new User(name,kor,eng,math);
    }

    public void render(){
//        List<String> names = new ArrayList<String>();
        List<String> names = new LinkedList<String>();
        names.add("홍길동");
        names.add("임꺽정");
        names.add("이몽룡");

        for(String name : names) {          // in과 : 은 같다.String name in names
            System.out.println(name);
        }

    }

}
