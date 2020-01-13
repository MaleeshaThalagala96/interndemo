package com.example.demo.payload;

import org.springframework.data.domain.Slice;

public class UserSummary {
    private Long id;
    private String username;
    private String name;
    private String license;


    public UserSummary(Long id, String username, String name,String license,String contact,String address) {
        this.id = id;
        this.username = username;
        this.name = name;


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
