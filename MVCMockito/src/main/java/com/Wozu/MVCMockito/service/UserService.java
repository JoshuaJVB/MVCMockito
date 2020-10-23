package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public interface UserService {
    Optional<User> getUserById(Long id);
    Iterable<User> getAllUsers();
    void saveUser(User user);
    Optional<User> updateUser(User newUser, long id);
    void removeUser(long id);
}
