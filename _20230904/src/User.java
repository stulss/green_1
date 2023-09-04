public class User {         // 클래스 만들기 = 객체 생성
    private String name;
    private int Kor;
    private int Eng;
    private int Math;

    public User(){}

    public User(String name, int kor, int eng, int math) {
        this.name = name;
        this.Kor = kor;
        this.Eng = eng;
        this.Math = math;
    }

//리스트 안에서 User의 값을 초기화하고 출력하는 프로그램 작성하기

    User printOut(){
        System.out.println("name = "+ getName() );
        System.out.println("Kor = "+getKor());
        System.out.println("Eng = "+getEng());
        System.out.println("Math = "+getMath());

        return printOut();
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
