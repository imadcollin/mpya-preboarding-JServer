package com.mpya.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {

    private String title;
    private String creator;
    private String date;

    public Item( String title,String creator, String date) {
        this.title = title;
        this.creator=creator;
        this.date=date;
    }

}
