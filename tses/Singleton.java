public class Singleton {
    private static Singleton instance = null;

    private Singleton(){
        //private 생성자
    }
    public static Singleton getInstance(){
        if(instance==null) {// 인스턴스가 아직 생성되지 않은 경우에만 생성
            instance = new Singleton();
        }
        return  instance;
    }


    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
