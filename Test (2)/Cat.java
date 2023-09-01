public class Cat extends Pet{


    public void initialize() {
        sound = "냐옹";
    }

    public void bark(){
        System.out.println("야옹");
    }

    public void eat(){
        System.out.println("냠냠");
    }

    public void play(){
        System.out.println("지붕이 들석");
    }

    public void walk(){
        System.out.println("사뿐사뿐");
    }

    public void sleep(){
        System.out.println("새근새근");
    }


    @Override
    public void Attack() {

    }
}
