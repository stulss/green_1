//컨트롤러의 위치
import java.util.Scanner;

public class MainUpdate {

    //CRUD의 개념만 작성 (크레이트 리드 업데이트 딜리트)
    Scanner scanner = new Scanner(System.in);

    private boolean flog = true;

    private int input()
    {
        int num = 0;
        try{
            System.out.println("입력 : ");
            num = scanner.nextInt();
        }
        catch (Exception e) {
            System.out.println("오류 발생!!");;
        }


        if(num < 1 || num >5)
            return 0;

        return num;
    }

    //메뉴 출력
    public void menu(){
        System.out.println("1. 학생 추가");
        System.out.println("2. 학생 조회");
        System.out.println("3. 학생 수정-미완성");
        System.out.println("4. 학생 삭제-미완성");
        System.out.println("5. 학생 출력-미완성");
    }



    private Student initialize(){
        //객체 생성
        Student student = new Student();

        //생성된 객체의 초기화
/*
        //아이디 생성
        System.out.println("학생 고유 번호를 입력하세요");
        int userID = StudentManager.getInstance().userID;
        student.setUserID(userID);
*/

        //이름 최기화
        System.out.println("학생 이름을 입력하세요");
        String name = scanner.nextLine();
        student.setName(name);

        //국어점수 초기화
        System.out.println("학생 국어점수 입력하세요");
        int KonScore = scanner.nextInt();
        student.setKorScore(KonScore);

        //영어점수 초기화
        System.out.println("학생 영어점수 입력하세요");
        int EngScore = scanner.nextInt();
        student.setEngScore(EngScore);

        //수학점수 초기화
        System.out.println("학생 수학점수 입력하세요");
        int MathScore = scanner.nextInt();
        student.setMathScore(MathScore);
        StudentManager.getInstance().C(student);

        //객체 반환
        return student;
    }

    public void printStudent(Student student){



        System.out.println("=========학생 정보=========");
        //System.out.println("학생 id : " + student.getUserID());
        System.out.println("학생 이름 : " + student.getName());
        System.out.println("국어 점수 : " + student.getKorScore());
        System.out.println("영어 점수 : " + student.getEngScore());
        System.out.println("수학 점수 : " + student.getMathScore());
    }





    public void render() {

        while (flog){
            menu();


            switch (input()) {
                case 1 -> {
                    Student student = initialize();
                    StudentManager.getInstance().C(student);

                }
                case 2 -> {
                    System.out.println("검색 학생의 이름을 입력해 주세요.");
                    String name = scanner.next();

                    Student foundStudent = StudentManager.getInstance().R(name);

                    if (foundStudent == null)
                        System.out.println("해당 학생은 존재하지 않습니다.");

                    else {
                        printStudent(foundStudent);     //검색된 학생의 정보 출력
                    }
                }
                case 3 -> {     // 학생 정보 수정
                    System.out.println("수정할 학생의 이름을 입력하세요");
                    String name = scanner.next();

                    System.out.println("학생 국어점수 입력하세요");
                    int konScore = scanner.nextInt();

                    System.out.println("학생 영어점수 입력하세요");
                    int engScore = scanner.nextInt();

                    System.out.println("학생 수학점수 입력하세요");
                    int mathScore = scanner.nextInt();

                    StudentManager.getInstance().U(name,konScore,engScore,mathScore);

                }

                case 4 -> {//학생 정보 삭제
                    System.out.println("삭제할 학생의 이름을 입력하세요:");
                    String name = scanner.next();

                    StudentManager.getInstance().D(name);
                }

                case 5 -> {//전체 학생 정보 출력
                    for(Student student : StudentManager.getInstance().getStudents()) {
                        printStudent(student);
                    }
                }

                default -> {
                    System.out.println("프로그램이 종료됩니다.");
                    flog = false;
                }
            }
        }

        //Student student = StudentManager.getInstance().R(scanner.nextLine());


    }
}
