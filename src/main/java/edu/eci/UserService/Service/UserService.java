package edu.eci.UserService.Service;

import edu.eci.UserService.data.User;

import java.util.List;

public interface UserService {
    User create(User user );

    User findById( String id );

    List<User> all();

    Boolean deleteById( String id );

    User update( User user, String userId );

}
