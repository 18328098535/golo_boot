package com.boot.business.entity;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column
    private String userName;

    @Column
    private String userPass;

    @Column
    private String flag;

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public String getFlag() {
        return flag;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
