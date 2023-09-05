import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*MainUpdate Main = new MainUpdate();
        Main.render();*/


       /* //HashSet은 입력한 순서대로 저장되는 것이 아니다.
        Set<String> set = new HashSet<>(); // HashSet에 대한 문자열변수 set을 생성
        set.add("사과");          // 사과 라는 문자열을 저장
        set.add("딸기");        // 바나나 라는 문자열을 저장
        set.add("바나나");         // 딸기 라는 문자열을 저장

        for(String element : set){          // set을 element에 저장
            System.out.println(element);    // element를 출력
        }
        */
        /*
        출력값         //set.add로 저장한 문자열이 입력한 순서와 다르게 출력된다.
        사과
        바나나
        딸기
        */

        /*Set<String> set = new TreeSet<>();
        set.add("사과");
        set.add("바나나");
        set.add("바나나");
        set.add("딸기");

        for (String element : set) {
            System.out.println(element);
        }*/

        /*Set<String> set = new LinkedHashSet<>();
        set.add("사과");
        set.add("배");
        set.add("수박");
        set.add("사과");

        for (String element : set) {
            System.out.println(element);
        }*/

        /*HashSet<String> set = new HashSet<String>(); //set선언

        set.add("a");
        set.add("b");
        set.add("b");  // set에 중복값 저장 불가
        set.add("d");  // set에 값 담기

        System.out.println("set 크기 확인 : " + set.size());

        Iterator<String> iter = set.iterator();  // set을 Iterator 안에 담기
        while(iter.hasNext()){  //iterator에 다음 값이 있다면
            System.out.println("iterator : " +iter.next());  // iter에서 값 꺼내기
        }*/


    }
}
