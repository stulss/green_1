package service;


import domain.User;

// ** 요구사항 분석에 의한 각종 기능들을 포함 및 실행되는 곳.
public class UserService {
    public User getUser(String userName)
    {
        return new User(userName);
    }


}
