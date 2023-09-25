package controller;


import Repository.UserRepository;
import com.sun.tools.javac.Main;
import domain.User;
import dto.UserDto;
import service.UserService;

import java.util.*;

// ** 메뉴 출력 후 입력값을 받았을 때 작동이 시작되는 곳
public class UserController {
    private Scanner scanner = null;
    private UserService userService = null;
    private Long id = 0L;

    public UserController() {
        scanner = new Scanner(System.in);
        userService = new UserService();

    }

    public void progress() {
        System.out.println("1.신규 회원 추가");
        System.out.println("2.회원 정보 변경");
        System.out.println("3.회원 정보 검색");
        System.out.println("4.회원 정보 삭제");
        System.out.println("5.전체 회원 정보");
        System.out.println("6.종료");
        System.out.print("입력 : ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1: {
                UserDto userDto = new UserDto();
                //이름
                System.out.print("이름을 입력 하세요 : ");
                userDto.setName(scanner.nextLine());

                //이메일
                System.out.print("이메일을 입력 하세요 : ");
                userDto.setEmail(scanner.nextLine());

                userService.save(userDto);
            }
            break;
            case 2:
                System.out.print("회원 이메일 입력 : ");
                String email = scanner.nextLine();

                User user = userService.findByEmail(email);
                System.out.println(
                        user.getId() + ", " +
                        user.getName() + ", " +
                        user.getEmail());

                System.out.print("변경할 이름 입력 : ");
                String name = scanner.nextLine();

                userService.changeName(email,name);
                break;
            case 3: {
                //id
                System.out.print("id 입력: ");
                long id = scanner.nextLong();
                User users = userService.findById(id);
                System.out.println(
                                users.getId() + ", " +
                                users.getName() + ", " +
                                users.getEmail());

                    /*
                    //이름 검색
                    System.out.print("이름 입력: ");
                    String name = scanner.nextLine();

                    List<User> users = userService.findByName(name);

                    for (User user : users) {
                        System.out.println(
                                user.getId() + ", " +
                                        user.getName() + ", " +
                                        user.getEmail() );*/

                    /*
                    //이메일
                    System.out.print("메일 주소 입력: ");
                    String email = scanner.nextLine();
                    User user = userService.findByEmail(email);

                    System.out.println("---------------------------");
                    System.out.println(
                            user.getId() + ", " +
                                    user.getName() + ", " +
                                    user.getEmail() );
                    System.out.println("---------------------------");
                    */
            }
                break;

            case 4:
                break;
            case 5:

                break;
            case 6:
                System.exit(0);
                break;


            }

        }
    }
