import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

//실제 작업이 이루어 지는 곳


public class StudentManager {

    //---------------------------------------
    //싱글톤
    private static StudentManager instance = null;

    public static StudentManager getInstance(){
        if(instance == null)
            instance = new StudentManager();

        return instance;
    }
    //---------------------------------------
    //생성자
    private StudentManager()
    {
        studentLIst = new LinkedList<>();
    }
    //----------------------------------------

    //저장소 생성 데이터
    private List<Student> studentLIst;
//    private int userID;

    //----------------------------------------
    //함수
    public void C(Student student){

//        Student student = new Student();
        studentLIst.add(student);
        //userID++;
        System.out.println("학생 추가 완료");

    }

    public Student R(String name){
        List<Student> students = new ArrayList<>();
        for(Student student : studentLIst)
        {
            if (student.getName().equals(name))
            {
                return student;
            }
        }

        return null;
    }

    public void  U(String name,int korScore, int engScore,int mathScore){
        List<Student> students = new ArrayList<>();

        for (Student student : studentLIst) {
            if(student.getName().equals(name)){
                student.setKorScore(korScore);
                student.setEngScore(engScore);
                student.setMathScore(mathScore);
                System.out.println("학생 점수 수정 완료");
                return ;
            }
        }
        System.out.println("해당 이름의 학생이 없습니다.");
    }

    /*
    public void  U(int score){
        List<Student> students = R(score);

    }
    */


    public void D(String name){
        for(Student student : studentLIst)
        {
            if(student.getName().equals(name)){
                studentLIst.remove(student);
                System.out.println("학생정보 삭제 완료");
                return;
            }
        }
        System.out.println("해당 이름의 학생이 없습니다.");
    }
    public List<Student> getStudents() {
        return new ArrayList<>(studentList);
    }

}
