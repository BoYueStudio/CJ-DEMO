package com.CASIC.domain;

/**
 * @Description: user-domain
 * @Author: boyue
 * @CreateDate: 2019/11/23 12:07
 * @Version: 1.0
 **/
public class User {
    private String id;
    private String userName;
    private String passWord;

    public User() {
        super();
    }

    public User(String id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
