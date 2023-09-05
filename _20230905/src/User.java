public class User {
    private String name;
    private int Kor;
    private int Eng;
    private int Math;

    public User(String name, int kor, int eng, int math) {
        this.name = name;
        Kor = kor;
        Eng = eng;
        Math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return Kor;
    }

    public void setKor(int kor) {
        Kor = kor;
    }

    public int getEng() {
        return Eng;
    }

    public void setEng(int eng) {
        Eng = eng;
    }

    public int getMath() {
        return Math;
    }

    public void setMath(int math) {
        Math = math;
    }
}
