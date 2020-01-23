package com.example.demo.controller;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.User;
import com.example.demo.payload.*;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.CurrentUser;
import com.example.demo.security.UserPrincipal;

//import com.example.demo.service.EditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by Maleesha Thalagala
 */

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    PasswordEncoder passwordEncoder;

    ////    @Autowired
////    private PollRepository pollRepository;
////
////    @Autowired
////    private VoteRepository voteRepository;
////
/*
    @Autowired
    private EditService editService;
*/

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public UserSummary getCurrentUser(@CurrentUser UserPrincipal currentUser) {
        UserSummary userSummary = new UserSummary(currentUser.getId(), currentUser.getUsername(), currentUser.getName(), currentUser.getLicense(), currentUser.getContact(), currentUser.getLocation(),currentUser.getEmail());
        return userSummary;

    }

    //Get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //User Profile
    @GetMapping("/users/{username}")
    public UserProfile getUserProfile(@PathVariable(value = "username") String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

        UserProfile userProfile = new UserProfile(user.getId(), user.getUsername(), user.getName(), user.getLicense(),user.getLocation(), user.getContact(),user.getEmail());
        return userProfile;
    }

    //Update User
    @PostMapping("/users/edit/{username}")
    public User updateUser(@PathVariable(value = "username") String username,
                           @Valid @RequestBody User userDetails) {

        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));

        user.setName(userDetails.getName());
        user.setLocation(userDetails.getLocation());
        user.setContact(userDetails.getContact());
        user.setEmail(userDetails.getEmail());
        user.setLicense(userDetails.getLicense());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        User updatedUser = userRepository.save(user);
        return updatedUser;
    }




    @GetMapping("/user/checkUsernameAvailability")
    public UserIdentityAvailability checkUsernameAvailability(@RequestParam(value = "username") String username) {
        Boolean isAvailable = !userRepository.existsByUsername(username);
        return new UserIdentityAvailability(isAvailable);
    }

    @GetMapping("/user/checkEmailAvailability")
    public UserIdentityAvailability checkEmailAvailability(@RequestParam(value = "email") String email) {
        Boolean isAvailable = !userRepository.existsByEmail(email);
        return new UserIdentityAvailability(isAvailable);
    }
}

//
//    @GetMapping("/users/{username}/polls")
//    public PagedResponse<PollResponse> getPollsCreatedBy(@PathVariable(value = "username") String username,
//                                                         @CurrentUser UserPrincipal currentUser,
//                                                        @RequestParam(value = "page", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) int page,
//                                                         @RequestParam(value = "size", defaultValue = AppConstants.DEFAULT_PAGE_SIZE) int size) {
//       return pollService.getPollsCreatedBy(username, currentUser, page, size);
//    }
//
//
//    @GetMapping("/users/{username}/votes")
//    public PagedResponse<PollResponse> getPollsVotedBy(@PathVariable(value = "username") String username,
//                                                     @CurrentUser UserPrincipal currentUser,
//                                                      @RequestParam(value = "page", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) int page,
//                                                      @RequestParam(value = "size", defaultValue = AppConstants.DEFAULT_PAGE_SIZE) int size) {
//       return pollService.getPollsVotedBy(username, currentUser, page, size);
//   }
//
//}
