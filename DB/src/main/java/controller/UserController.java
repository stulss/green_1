package controller;

import domain.User;
import dto.UserDto;
import service.UserService;

import java.util.List;
import java.util.Scanner;

public class UserController {

    private Scanner scanner = null;
    private UserService userService = null;

    public UserController(){
        scanner = new Scanner(System.in);
        userService = new UserService();
    }



    public void progress() {
        System.out.println("1. 신규 회원 추가");
        System.out.println("2. 회원 정보 변경");
        System.out.println("3. 회원 정보 검색");
        System.out.println("4. 회원 정보 삭제");
        System.out.println("5. 전체 회원 정보");
        System.out.println("6. 종료");
        System.out.print("입력 : ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch(choice) {
            case 1:
            {
                UserDto userDto = new UserDto();

                // 이름
                System.out.print("이름 입력 : ");
                userDto.setName(
                        scanner.nextLine());

                // 이메일
                System.out.print("이메일 입력 : ");
                userDto.setEmail(
                        scanner.nextLine());

                userService.save(userDto);
            }
            break;
            case 2:
            {
                System.out.print("변경할 회원 번호 입력 : ");
                Long id = scanner.nextLong();
                scanner.nextLine();

                UserDto userDto = new UserDto(
                        userService.findById(id));

                // 이름
                System.out.print("변경할 이름 입력 : ");
                String name = scanner.nextLine();
                userDto.setName(name);

                // 이메일
                System.out.print("변경할 이메일 입력 : ");
                String email = scanner.nextLine();
                userDto.setEmail(email);

                userService.save(userDto);
            }
            break;
            case 3:
            {
                // ** id
                System.out.print("ID 입력: ");
                Long Id = scanner.nextLong();
                scanner.nextLine();

                User user = userService.findById(Id);

                System.out.println("---------------------------");
                if(user != null) {
                    System.out.println(
                            user.getId() + ", " +
                                    user.getName() + ", " +
                                    user.getEmail() );
                }
                else {
                    System.out.println("null");
                }
                System.out.println("---------------------------");

                // ** 이름 검색
                /*
                System.out.print("이름 입력: ");
                String name = scanner.nextLine();

                for (User user : userService.findByName(name)) {
                    System.out.println("---------------------------");
                    System.out.println(
                            user.getId() + ", " +
                            user.getUserName() + ", " +
                            user.getEmail() );
                }
                */




                // ** email
                /*
                System.out.print("메일 주소 입력: ");
                String email = scanner.nextLine();

                User user = userService.findByEmail(email);

                System.out.println("---------------------------");
                System.out.println(
                        user.getId() + ", " +
                                user.getUserName() + ", " +
                                user.getEmail() );
                System.out.println("---------------------------");
                */
            }
            break;
            case 4:
            {
                System.out.print("ID 입력: ");
                Long Id = scanner.nextLong();
                scanner.nextLine();

                userService.deleteUser(Id);
            }
            break;
            case 5:
            {
                for (User user : userService.findAll()) {
                    System.out.println("---------------------------");
                    System.out.println(
                            user.getId() + ", " +
                                    user.getName() + ", " +
                                    user.getEmail() );
                }
            }
            break;
            case 6:
                System.exit(0);
                break;
            }

        }
    }
