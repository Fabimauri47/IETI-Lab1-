package edu.eci.UserService.dto;

public class UserDto {
    private String  name;
    private String  email;
    private String lastname;

    public UserDto(String name, String email, String lastname) {
        this.name = name;
        this.email = email;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
