package com.example.demo.payload;

import org.springframework.data.domain.Slice;

public class UserSummary {
    private Long id;
    private String username;
    private String name;
    private String license;
    private int contact;
    private String location;
    private String email;


    public UserSummary(Long id, String username, String name,String license,int contact,String location,String email) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.location=location;
        this.license=license;
        this.contact=contact;
        this.email=email;


    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLicense(){return license;}

    public void setLicense(String license){ this.license=license;}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
