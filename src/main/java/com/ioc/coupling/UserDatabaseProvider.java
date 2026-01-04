package com.ioc.coupling;


public class UserDatabaseProvider implements UserDataProvider {

    @Override
    public String getUserDetails() {

        return "User Details from the database";

// A - MySQL, PostgreSQL
// B - WebServices, MongoDB

    }
}