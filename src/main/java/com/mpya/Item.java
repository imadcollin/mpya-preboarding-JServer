package com.mpya;

import java.util.Date;

public class Item {

    private int id;
    private String title;
    private Date creation;

    public Item(int id, String title, Date creation) {
        this.id = id;
        this.title = title;
        this.creation = creation;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getCreation() {
        return creation;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }


}
