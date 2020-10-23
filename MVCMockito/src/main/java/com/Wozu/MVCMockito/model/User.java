package com.Wozu.MVCMockito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private int [] postIds;
    private int accountAge;
    private int userAge;

    public User(){

    }

    public User(String userName, int[] postIds, int accountAge, int userAge) {
        this.userName = userName;
        this.postIds = postIds;
        this.accountAge = accountAge;
        this.userAge = userAge;
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int[] getPostIds() {
        return postIds;
    }

    public void setPostIds(int[] postIds) {
        this.postIds = postIds;
    }

    public int getAccountAge() {
        return accountAge;
    }

    public void setAccountAge(int accountAge) {
        this.accountAge = accountAge;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
