package domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Getter
public class User {
    // ** User가 갖고 있는 데이터

    // ** User name
    private Long id;
    private String name;
    private String email;

    public User() {
    }

    @Builder
    public User( Long id, String name, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }


}
