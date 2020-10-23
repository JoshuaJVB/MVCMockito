package com.Wozu.MVCMockito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long adminId;
    private Long userId; //foreign key to user model
    private String password;
    private boolean canEditPosts;
    private boolean canDeletePosts;
    private boolean canSuspendUsers;
    private boolean canAdvertise;
//    private ArrayList<Posts> posts;
//    private ArrayList<Advertisments> ads;

    public Admin(){}

    public Admin(Long userId, String password, boolean canEditPosts, boolean canDeletePosts, boolean canSuspendUsers, boolean canAdvertise) {
        this.userId = userId;
        this.password = password;
        this.canEditPosts = canEditPosts;
        this.canDeletePosts = canDeletePosts;
        this.canSuspendUsers = canSuspendUsers;
        this.canAdvertise = canAdvertise;
    }

    public Long getAdminId(){
        return adminId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isCanEditPosts() {
        return canEditPosts;
    }

    public void setCanEditPosts(boolean canEditPosts) {
        this.canEditPosts = canEditPosts;
    }

    public boolean isCanDeletePosts() {
        return canDeletePosts;
    }

    public void setCanDeletePosts(boolean canDeletePosts) {
        this.canDeletePosts = canDeletePosts;
    }

    public boolean isCanSuspendUsers() {
        return canSuspendUsers;
    }

    public void setCanSuspendUsers(boolean canSuspendUsers) {
        this.canSuspendUsers = canSuspendUsers;
    }

    public boolean isCanAdvertise() {
        return canAdvertise;
    }

    public void setCanAdvertise(boolean canAdvertise) {
        this.canAdvertise = canAdvertise;
    }
}
