package com.example.demo.payload;

import java.time.Instant;

public class UserProfile {
    private Long id;
    private String username;
    private String name;
    private String license;
    private String address;
    private int contact;
//    private Instant joinedAt;
//    private Long pollCount;
//    private Long voteCount;

    public UserProfile(Long id, String username, String name,String license, String address,int contact) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.license=license;
        this.address=address;
        this.contact=contact;
//        this.joinedAt = joinedAt;
//        this.pollCount = pollCount;
//        this.voteCount = voteCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getLicense(){return license;}

    public void setLicense(String license){this.license=license;}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public Instant getJoinedAt() {
//        return joinedAt;
//    }
//
//    public void setJoinedAt(Instant joinedAt) {
//        this.joinedAt = joinedAt;
//    }
//
//    public Long getPollCount() {
//        return pollCount;
//    }
//
//    public void setPollCount(Long pollCount) {
//        this.pollCount = pollCount;
//    }
//
//    public Long getVoteCount() {
//        return voteCount;
//    }
//
//    public void setVoteCount(Long voteCount) {
//        this.voteCount = voteCount;
//    }
}