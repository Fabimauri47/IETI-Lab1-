package edu.eci.UserService.data;

import edu.eci.UserService.dto.UserDto;

import java.util.Date;
import java.util.UUID;

public class User {
    private String name;
    private String email;
    private String lastname;
    private String id;
    private Date createdAt;

    public User(String name, String email, String lastname) {
        this.name = name;
        this.email = email;
        this.lastname = lastname;
        this.id = UUID.randomUUID().toString();
        this.createdAt =  new Date();
    }
    public User(UserDto userdto){
        this.name = userdto.getName();
        this.email = userdto.getEmail();
        this.lastname = userdto.getLastname();
        this.id = UUID.randomUUID().toString();
        this.createdAt = new Date();
    }

    public User(UserDto userdto,String id){
        this.name = userdto.getName();
        this.email = userdto.getEmail();
        this.lastname = userdto.getLastname();
        this.id = id;
        this.createdAt = new Date();
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}




