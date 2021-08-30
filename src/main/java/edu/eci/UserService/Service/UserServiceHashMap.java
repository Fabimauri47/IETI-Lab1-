package edu.eci.UserService.Service;

import edu.eci.UserService.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class UserServiceHashMap implements UserService{
    private final HashMap<String,User> users = new HashMap();
    @Override
    public User create(User user) {
        users.put(user.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) {
        if(users.containsKey(id)){
            return users.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        List<User>list = new ArrayList();
        for(User user: users.values()){
            list.add(user);
        }
        return list;
    }

    @Override
    public Boolean deleteById(String id) {
       return users.remove(id,users.get(id));
    }

    @Override
    public User update(User user, String userId) {
        users.put(userId,user);
        return user;
    }
}
