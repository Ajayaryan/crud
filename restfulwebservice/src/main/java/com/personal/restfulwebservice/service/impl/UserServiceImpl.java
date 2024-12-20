package com.personal.restfulwebservice.service.impl;

import com.personal.restfulwebservice.entity.User;
import com.personal.restfulwebservice.repository.UserRepository;
import com.personal.restfulwebservice.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
@Slf4j
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


//    @Override
//    public User updateUser(User user) {
//        System.out.println(user.getClass());
//        Optional<User> optionalUser = userRepository.findById(user.getId());
//        if (optionalUser.isPresent()) {
//            User existingUser = optionalUser.get();
//            existingUser.setFirstName(user.getFirstName());
//            existingUser.setLastName(user.getLastName());
//            existingUser.setEmail(user.getEmail());
//            return userRepository.save(existingUser);
//        } else {
//            throw new NoSuchElementException("User not found with id: " + user.getId());
//        }
//    }




    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }
}