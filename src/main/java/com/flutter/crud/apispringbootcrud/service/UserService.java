package com.flutter.crud.apispringbootcrud.service;

import com.flutter.crud.apispringbootcrud.entity.User;
import com.flutter.crud.apispringbootcrud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserService {
@Autowired
private UserRepository repository;

public List<User> getUsers(){
    return repository.findAll();
}

public User saveUser(User user){
    return repository.save(user);
}


public String deleteUser(int id){
    repository.deleteById(id);
    return "User deleted successfully" + id;
}



public User updateUser(User user){
    User existingUser = repository.findById(user.getId()).orElse(null);
    existingUser.setName(user.getName());
    existingUser.setEmail(user.getEmail());
    existingUser.setAddress(user.getAddress());
    return repository.save(existingUser);
}






}
