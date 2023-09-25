package service;


import Repository.UserRepository;
import domain.User;
import dto.UserDto;

import java.util.List;

// ** 요구사항 분석에 의한 각종 기능들을 포함 및 실행되는 곳.
public class UserService {

    private UserRepository userRepository = null;

    public UserService(){
        userRepository = new UserRepository();
        userRepository.createTable();
    }

    public void save(UserDto userDto) {
        userRepository.save(userDto.toEntity());
    }


    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    public void changeName(String email,String name){
        User user = userRepository.findByEmail(email);
        userRepository.save(name, email);
    }


    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findById(long id) {
        return userRepository.findById(id);
    }
}

