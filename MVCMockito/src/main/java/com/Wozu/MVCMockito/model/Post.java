package com.Wozu.MVCMockito.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long userID;
    private String content;
    private String datePosted;

    public Post(Long userID, String content){
        this.userID =userID;
        this.content = content;
        this.datePosted = new Date().toString();
    }

    public Long getId(){
        return id;
    }

    public Long getAuthor(){
        return userID;
    }

    public String getDatePosted(){
        return datePosted;
    }


}
