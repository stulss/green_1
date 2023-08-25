import java.util.Scanner;
class Test {



    private String name;
    private int age;

    public void Initialize()
    {
        this.name = getName();
        this.age = getAge();
    }
    public void Update()
    {
        System.out.println(name);
    }

    private String getName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력해 주세요.");
        String name = scanner.nextLine();


        return name;
    }
    private int getAge()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력해주세요.");
        int age = scanner.nextInt();


        return age;
    }















    public void Output()
    {
        System.out.println("Hello World!!");
    }

}