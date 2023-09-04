
public class Main {

    int height;
    int weight;
    int age;
    boolean sex;        // true : 수컷        false : 암컷
    int running(int x, int y){
        int result = (age*x)-y;
        return result;
    }     // 달리기
    boolean fight(Main x){
        boolean result = true;
        if(height > x.height && weight > x.weight)
            result = true;
        else result = false;
        return result;
    }         // 싸우기
    boolean hunting(){
        if(age>20) return false;
        else return  true;
    }             // 사냥하기
    String sleeping(){return "Going to Sleep!!!";}             // 잠자기
    void printOut(){
        System.out.println("height="+height);
        System.out.println("weight="+weight);
        System.out.println("age="+age);
        System.out.println("sex="+(sex ? "MAIL" : "FEMAIL"));

    }


    public static void main(String[] args) {
        Main a= new Main();
        Main b= new Main();

        a.height = 160;
        a.weight = 100;
        a.age = 10;
        a.sex = true;

        b.height = 130;
        b.weight = 90;
        b.age = 9;
        b.sex = false;

        System.out.println("[A Lion]");
        a.printOut();
        System.out.println("running = "+a.running(5,20));
        System.out.println("hunting = "+a.hunting());

        System.out.println("[B Lion]");
        b.printOut();
        System.out.println("running = "+b.running(6,30));
        System.out.println("hunting = "+b.hunting());

        boolean result = b.fight(a);
        String win = result ? "B Lion WINNER!!" : "A Lion WINNER!!";
        System.out.println("A FIGHT B : "+win);

        System.out.println("A Lion : "+a.sleeping());
        System.out.println("A Lion : "+b.sleeping());

        a = b = null;
        System.gc();


    }
}