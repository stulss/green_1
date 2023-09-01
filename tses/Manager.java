public class Manager {


    public static int number;

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Manager.number = number;
    }



    public int num;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private Manager(){

    }

    public  static void ErrorMessage(String msg)
    {
        System.out.println("Error : " + msg);
    }
}
