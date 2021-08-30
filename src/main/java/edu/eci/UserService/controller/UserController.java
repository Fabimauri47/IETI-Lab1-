package edu.eci.UserService.controller;

import edu.eci.UserService.Service.UserService;
import edu.eci.UserService.data.User;
import edu.eci.UserService.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/v1/user" )
public class UserController
{
    private final UserService userService;

    public UserController(@Autowired UserService userService )
    {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<List<User>> all()
    {
        return new ResponseEntity(userService.all(), HttpStatus.OK;

    }

    @GetMapping( "/{id}" )
    public ResponseEntity<User> findById(@PathVariable String id )
    {
        return new ResponseEntity(userService.findById(id),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<User> create( @RequestBody UserDto userDto ) {
        return new ResponseEntity(userService.create(new User(userDto)), HttpStatus.OK);

    }


    @PutMapping( "/{id}" )
    public ResponseEntity<User> update( @RequestBody UserDto userDto, @PathVariable String id )
    {
        return new ResponseEntity(userService.update(new User(userDto,id),id),HttpStatus.OK);

    }

    @DeleteMapping( "/{id}" )
    public ResponseEntity<Boolean> delete( @PathVariable String id )
    {
        return new ResponseEntity(userService.deleteById(id),HttpStatus.OK);
    }
}