import java.util.Scanner;

public class User {
    private static String name;
    private String password;
    private int age;

    private Address address;


    public Address getAddress() { return address; }
    public User setAddress(Address address)
    {
        this.address = address;
        return this;
    }

    // ** Name
    public static String getName() {
        return name; }

    public User setName(String name)
    {
        this.name = name;
        return this;
    }

    // ** Password
    public String getPassword() { return password; }
    public User setPassword(String password)
    {
        this.password = password;
        return this;
    }

    // ** Age
    public int getAge() { return age; }
    public User setAge(int age)
    {
        this.age = age;
        return this;
    }


    // ** 생성자
    public User()
    {
        this.name = "";
        this.password = "";
        this.age = 0;
        this.address = new Address();
    }

    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }


    public User(User user) {
        this.name = user.getName();
        this.password = user.getPassword();
        this.age = user.getAge();
        this.address = new Address(
                user.getAddress().num1,
                user.getAddress().num2,
                user.getAddress().num3);
    }


    /*
            private String getName()
            {
                Scanner scanner = new Scanner(System.in);

                // ** 사용자에게 입력 안내 메시지 출력
                System.out.print("이름을 입력해주세요: ");

                // ** 사용자로부터 한 줄을 입력받아 name 변수에 저장
                String name = scanner.nextLine();

                return name;
            }

            public void Initialize()
            {
                this.name = getName();
            }
         */
    public void render()
    {
        System.out.println(name);
    }
}
