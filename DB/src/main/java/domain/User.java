package domain;

import lombok.Data;

@Data
public class User {
    // ** User가 갖고 있는 데이터

    // ** User name
    private String name;

    public User(){}

    public User(String name) {
        this.name = name;
    }
}
