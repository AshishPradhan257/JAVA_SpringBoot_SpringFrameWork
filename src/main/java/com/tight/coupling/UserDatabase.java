package com.tight.coupling;


public class UserDatabase {
    public String getUserDetails(){
        return "User Details from the database";

// A - MySQL, PostgreSQL
// B - WebServices, MongoDB

public class UserDatabase {
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database";
    }
}
