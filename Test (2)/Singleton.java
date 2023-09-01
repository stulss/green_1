public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
        // private constructor
        number1_MAX = 50;
        number2_MAX = 50;
        number3_MAX = 50;
        number4_MAX = 50;
        number5_MAX = 50;

        number1 = number1_MAX;
        number2 = number2_MAX;
        number3 = number3_MAX;
        number4 = number4_MAX;
        number5 = number5_MAX;
    }

    public static Singleton getInstance()
    {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }


    private int petType ;

    private int number1;
    public int number1() { return number1; }

    private int number2;
    private int number3;
    private int number4;
    private int number5;

    private int number1_MAX;
    private int number2_MAX;
    private int number3_MAX;
    private int number4_MAX;
    private int number5_MAX;



}
