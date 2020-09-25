package com.mpya;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import javax.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class User {

    private @Id
    @GeneratedValue  Long id;
    private String name;
    private ArrayList<Item> userItems;

    public User( String name, ArrayList<Item> userItems) {
        this.name = name;
        this.userItems = userItems;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getUserItems() {
        return userItems;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserItems(ArrayList<Item> userItems) {
        this.userItems = userItems;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}
