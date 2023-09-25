package controller;


import domain.User;
import service.UserService;

// ** 메뉴 출력 후 입력값을 받았을 때 작동이 시작되는 곳
public class UserController {
    private UserService userService = null;

    public UserController(){
        this.userService = new UserService();
    }

    public void Login(){
        String name = "홍길동";
        User user = this.userService.getUser(name);

        System.out.println(user.getUserName);
    }
}
