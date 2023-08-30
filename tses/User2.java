//getter & setter
public class User2 {
    private String userName;    //아이디
    private String password;    //비밀번호
    private int age;    //나이

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }
    }
}
