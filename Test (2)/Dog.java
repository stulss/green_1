
public class Dog extends Pet{

    public void initialize()
    {
        sound = "멍멍";
    }

    public void bark(){
        System.out.println("왈왈");
    }

    public void eat(){
        System.out.println("와구와구");
    }

    public void play(){
        System.out.println("우당탕");
    }

    public void walk(){
        System.out.println("킁킁");
    }

    public void sleep(){
        System.out.println("쿨쿨");
    }

    @Override
    public void Attack() {

    }
}
