package com.tight.coupling;

// A - MySQL, PostgreSQL
// B - WebServices, MongoDB

public class UserDatabase {
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database";
    }
}
