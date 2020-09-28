package com.mpya;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Getter
@Setter
public class Item {

    private String title;
    private String creator;
    private String date;

    public Item(String title,String creator, String date) {
        this.title = title;
        this.creator=creator;
        this.date=date;
    }

}
