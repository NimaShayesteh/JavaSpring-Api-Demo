package com.example.demo.domain.user;

import javax.persistence.*;

@Entity
@Table
public class applicationuser {
    @Id
    @SequenceGenerator(
            name = "applicationuser_Sequence",
            sequenceName = "applicationuser_Sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "applicationuser_Sequence"
    )
    private String name;
    private String fam;
    private String userName;
    private String password;
    private Long id;

    public applicationuser() {
    }

    public applicationuser(String name, String fam, String userName, String password, Long id) {
        this.name = name;
        this.fam = fam;
        this.userName = userName;
        this.password = password;
        this.id = id;
    }

    public applicationuser(Long id) {
        this.id = id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
