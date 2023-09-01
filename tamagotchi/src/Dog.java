public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("개가 밥을 먹습니다.");
    }

    @Override
    public void fist() {
        System.out.println("개가 앞발로 마구 때립니다.");
    }

    @Override
    public void play() {
        System.out.println("개가 뛰어다닙니다");
    }

    @Override
    public void sleep() {
        System.out.println("개가 잠을 잡니다.");
    }

    @Override
    public void sound() {
        System.out.println("개가 왈왈!!!하고 웁니다.");
        System.out.println("왈왈!!!");
    }
}
