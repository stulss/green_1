package service;

import domain.User;
import dto.UserDto;
import Repository.UserRepository;

import java.util.List;

public class UserService {

    private UserRepository userRepository = null;

    public UserService() {
        userRepository = new UserRepository();
        userRepository.createTable();
    }

    public void save(UserDto userDto) {
        userRepository.save(userDto.toEntity());
    }

    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findById(Long id) {
        return userRepository.findById(id);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}


