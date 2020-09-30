package com.mpya.models;

import com.mpya.Address;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Getter
@Setter
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Address address;

    //@DBRef
    private List<Item> items;

    public User(String firstName, String lastName, String dateOfBirth, Address address, List<Item> items) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.items = items;
    }

}
