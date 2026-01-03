package com.loose.coupling;


public class UserDatabaseProvider implements UserDataProvider{

    @Override
    public String getUserDetails(){

        return "User Details from the database";

// A - MySQL, PostgreSQL
// B - WebServices, MongoDB

public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails(){
        // Directly access database here
        return "User Details From Database";
    }
}
