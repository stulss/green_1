package dto;

import domain.User;
import lombok.Data;

@Data
public class UserDto {
    private long id;
    private String name;
    private String email;

    /*public UserDto setId(long id) {
        this.id = id;
        return this;
    }
    public UserDto setName(String name) {
        this.name = name;
        return this;
    }
    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }*/

    public UserDto(){}

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
    }

    public User toEntity(){
        return User.builder()
                .id(id)
                .name(name)
                .email(email)
                .build();
    }
}
