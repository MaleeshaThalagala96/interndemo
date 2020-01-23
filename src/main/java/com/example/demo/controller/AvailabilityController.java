//package com.example.demo.controller;
//
//
//import com.example.demo.exception.ResourceNotFoundException;
//import com.example.demo.model.User;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@RestController
//@RequestMapping("/api")
//public class AvailabilityController {
//
//
//    //Availability
//    @PostMapping("/users/availability/{username}")
//    public User updateUser(@PathVariable(value = "username") String username,
//                           @Valid @RequestBody User userDetails) {
//
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
//
//        user.setName(userDetails.getName());
//        user.setLocation(userDetails.getLocation());
//        user.setContact(userDetails.getContact());
//        user.setEmail(userDetails.getEmail());
//        user.setLicense(userDetails.getLicense());
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//
//        User updatedUser = userRepository.save(user);
//        return updatedUser;
//    }
//
//
//
//
//
//
//
//}
