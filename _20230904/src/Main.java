
public class Main {
    public static void main(String[] args) {

        /*int i = 0;
        if(i<10){}*/

        /*int i = 0;

        if(i < 10){

        }
        else{

        }*/

        /*int i = 0;

        switch(i){
            case 0:

                break;
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
        }*/

        /*int[] numbers = new int[]{10,20,30,40};

        int i = 0;
        // 변수이름은 같은 이름으로 중복 선언될 수 없다.
        //for(int i = 0; i< 10; ++i)
        //for(i = 0; i< 10; ++i)
        // 증감수식이 없으면 무한루프에 걸린다.
        //for문도 while문 처럼 활용이 가능하다.
        for(i = 0; i< 10; ){
             System.out.println(numbers[i]);
        }*/


        /*for(int i =0; i < 10; ++i){
            if(i ==5)
                continue;
        }


        int i = 0;
// continue 보다 뒤에 증감식이 있으면 i의 값이 증가하지 않아서 무한루프에 걸린다.
        while(i<10){
            if(i==5)
                continue;
            i++;
        }*/

        /*
        //static은 정적 선언. 데이터 영역으로 올려준다.
        //주소가 정적 자료이다.

        //int num = new int; //new를 할당하는건 동적할당이다.
        //public static Main sigle = new Main();
        */

        // Main에서 render를 호출하겠다.
        MainUpdate Main = new MainUpdate();
        Main.render();


    }
}