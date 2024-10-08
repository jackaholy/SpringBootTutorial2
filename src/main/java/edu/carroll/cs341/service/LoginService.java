package edu.carroll.cs341.service;

import edu.carroll.cs341.web.form.LoginForm;

public interface LoginService {

    /**
     * Given a loginForm, determine if the information provided is valid, and the user exists in the system.
     * @param username - Username of the person attempting to login
     * @param password - Raw password provided by the user logging in
     * @return true if data exists and matches what's on record, false otherwise
     */
    boolean validateUser(String username, String password);
}