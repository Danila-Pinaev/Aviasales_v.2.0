package com.example.aviasales2.service;

import com.example.aviasales2.entity.User;
import com.example.aviasales2.entity.transferObjects.UserDTO;

import java.util.List;

public interface UserService {
    User save(User user);
    User findById(Long id);
    List<UserDTO> findAll();
    List<User> findAllByLastName(String lastName);
    User findByEmail(String email);
    List<User> findByLastNameAndEmail(String lastName, String email);
    void update(User user);
    void delete(User user);
    void deleteById(Integer id);
    User findByUserName(String userName);
    User findByHashConfirm(String hashConfirm);
}
