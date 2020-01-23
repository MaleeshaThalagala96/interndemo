package com.example.demo.payload;


public class UserProfile {
    private Long id;
    private String username;
    private String name;
    private String license;
    private String location;
    private int contact;
    private String email;
//    private Instant joinedAt;
//    private Long pollCount;
//    private Long voteCount;

    public UserProfile(Long id, String username, String name,String license, String location,int contact,String email) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.license=license;
        this.location=location;
        this.contact=contact;
        this.email=email;
     // this.joinedAt = joinedAt;
       // this.pollCount = pollCount;
//        this.voteCount = voteCount;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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