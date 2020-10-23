package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.User;
import com.Wozu.MVCMockito.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepo userRepo;

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepo.findById(id);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public void saveUser(User user) {
        userRepo.save(user);
    }

    @Override
    public Optional<User> updateUser(User newUser, long id) {
        userRepo.findById(id)
                .map(user->{
                    user.setUserName(newUser.getUserName());
                    user.setPostIds(newUser.getPostIds());
                    user.setAccountAge(newUser.getAccountAge());
                    user.setUserAge(newUser.getUserAge());
                    return userRepo.save(user);
                });
        return userRepo.findById(id);
    }

    @Override
    public void removeUser(long id) {
        userRepo.deleteById(id);
    }
}
