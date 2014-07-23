package com.phtest.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 7299264265184515893L;
	private String username;
    private String password;
    
    public String execute() {
        if (this.username.equals("asd") && this.password.equals("asd")) {
            return SUCCESS;
        }
        addActionError(getText("error.login"));
        return LOGIN;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

