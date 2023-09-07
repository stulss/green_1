//ntt 라는 테이블이라고 보면된다.
//밑의 정보를 저장하고 있는 객체

public class Student {
    //private   int userID;
    private String name;
    private int korScore;
    private int engScore;
    private int mathScore;


    public Student() {
    }

    public Student(int userID, String name, int korScore, int engScore, int mathScore) {
        //this.userID = userID;
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    //public int getUserID() {return userID;}
    //public void setUserID(int id) {this.userID = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getKorScore() {return korScore;}
    public void setKorScore(int korScore) {this.korScore = korScore;}

    public int getEngScore() {return engScore;}
    public void setEngScore(int engScore) {this.engScore = engScore;}

    public int getMathScore() {return mathScore;}
    public void setMathScore(int mathScore) {this.mathScore = mathScore;}
}
