public class Cat extends Pet {
    @Override
    public void eat() {
        System.out.println("고양이가 밥을 먹습니다.");
    }

    @Override
    public void fist() {
        System.out.println("고양이가 앞발로 마구 때립니다.");
    }

    @Override
    public void play() {
        System.out.println("고양이가 뛰어다닙니다");
    }

    @Override
    public void sleep() {
        System.out.println("고양이가 잠을 잡니다.");
    }

    @Override
    public void sound() {
        System.out.println("고양이가 야~옹!하고 웁니다.");
        System.out.println("야~옹!");
    }
}

