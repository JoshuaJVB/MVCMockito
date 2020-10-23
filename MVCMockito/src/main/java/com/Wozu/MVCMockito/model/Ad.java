package com.Wozu.MVCMockito.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long adminId;       // Actual Admin object     - @OneToOne
    private String category;    // List of Category object - @OneToMany
    private String tag;         // List of Tag object      - @OneToMany
    private String advertiser;
    private String message;
    private String callToAction;

    public Ad(Long adminId, String category, String tag, String advertiser, String message, String callToAction) {
        this.adminId = adminId;
        this.category = category;
        this.tag = tag;
        this.advertiser = advertiser;
        this.message = message;
        this.callToAction = callToAction;
    }

    public Ad() {

    }

    public Long getId() {
        return id;
    }

    public Long getAdminId() {
        return adminId;
    }

    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAdvertiser() {
        return advertiser;
    }

    public void setAdvertiser(String advertiser) {
        this.advertiser = advertiser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCallToAction() {
        return callToAction;
    }

    public void setCallToAction(String callToAction) {
        this.callToAction = callToAction;
    }
}
