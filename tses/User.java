import java.util.*;
public class User {

    private String name;
    private String password;
    private int age;
    private Address address;
/*
    public Address getAddress() {return address;}
    public User setAddress(Address address){
        this.address = address;
        return this;
    }

    //Name
    public static String getName(){
        Manager.setNumber(100000);
        return ;
    }
  */



    public User(){



        this.name="";
        this.password ="";
        this.age=0;
        this.address=new Address();
    }

    //public User(User user){this(user.name,user.password,user.age);}

    public  User(String password, int age){
        this("",password,age);
    }

    public User(String name,String password,int age) {

        Manager.setNumber(100);

        this.name = name;
        this.password = password;
        this.age = age;
    }

    public static void gerName() {
    }

    public Address getAddress() {
        return address;
    }
    public User setAddress(Address address)
    {
        this.address = address;
        return this;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void render() {
    }
}