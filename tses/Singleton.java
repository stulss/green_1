public class Singleton {
    private static Singleton instance;

    private Singleton(){
        //private 생성자
    }
    public static Singleton getInstance(){
        if(instance==null) {// 인스턴스가 아직 생성되지 않은 경우에만 생성
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return  instance;
    }
}
