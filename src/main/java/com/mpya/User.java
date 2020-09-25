package com.mpya;

import java.util.ArrayList;

public class User {

    private String id;
    private String name;
    private ArrayList<Item> userItems;

    public User(String id, String name, ArrayList<Item> userItems) {
        this.id = id;
        this.name = name;
        this.userItems = userItems;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getUserItems() {
        return userItems;
    }

    public void setId(String id) {
        this.id = id;
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
