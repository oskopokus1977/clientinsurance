package com.service;

public interface SecurityService {

    String findLoggedInUserLogin();
    void autoLogin(String login, String password);
}
