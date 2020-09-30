
package com.mpya;

import com.mpya.models.User;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserCtrl {
    private final UserRepo repository;

    public UserCtrl(UserRepo repository) {
        this.repository = repository;
    }

    @GetMapping("/user")
    List<User> all() {
        return repository.findAll();
    }

    @PostMapping("/user")
    User newUser(@RequestBody User newUser) {
        return repository.save(newUser);
    }


    @GetMapping("/user/{id}")
    User one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));
    }

    @PutMapping("/user/{id}")
    User replaceUser(@RequestBody User newUser, @PathVariable Long id) {

        return repository.findById(id)
                .map(user -> {
                    user.setFirstName(newUser.getFirstName());

                    return repository.save(user);
                })
                .orElseGet(() -> {
                    return repository.save(newUser);
                });
    }

    @DeleteMapping("/user/{id}")
    void deleteUser(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

