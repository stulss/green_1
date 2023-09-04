public class gettersetter {
    private String userName;    // 아이디
    private String password;    // 비밀번호

    // getter는 값을 참조하기 위해 사용.
    public String getUserName() {
        return userName;
    }
    //setter는 값을 변경하기 위해 사용
    public void setUserName(String userName) {
        this.userName = userName;
    }

    // getter는 값을 참조하기 위해 사용.
    public String getPassword() {
        return password;
    }
    //setter는 값을 변경하기 위해 사용
    public void setPassword(String password) {
        this.password = password;
    }
}
