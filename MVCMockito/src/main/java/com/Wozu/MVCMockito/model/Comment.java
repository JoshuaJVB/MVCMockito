package com.Wozu.MVCMockito.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Comment {

	private Long userId;
	private Long postId;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String heading; // Will most likely be the user's name
	private Date lastUpdated;
	private String body;

	// =========================================================
    // Getters
    // =========================================================

	public Long getUserId() {
		return userId;
	}

	public Long getPostId() {
		return postId;
	}

	public Long getId() {
		return id;
	}

	public String getHeading() {
		return heading;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public String getBody() {
		return body;
	}

	// =========================================================
    // Setters
    // =========================================================

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
