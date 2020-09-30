package com.mpya;

import com.mpya.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepo extends MongoRepository<User, Object> {
    List<User> findByFirstName(final String country);

}
