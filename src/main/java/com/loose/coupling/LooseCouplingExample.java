package com.loose.coupling;

<<<<<<< HEAD
public class LooseCouplingExample {

    public static void main(String[] args){
=======

public class LooseCouplingExample {

    public static void main(String[] args){

        //by spring framework this can be done directly, without providing the dependency!

        UserDataProvider databaseProvider = new UserDatabaseProvider();
        UserManager userManagerWithDB = new UserManager(databaseProvider);
        System.out.println(userManagerWithDB.getUserInfo());

        UserDataProvider webServiceProvider = new WebServiceDataProvider();

        UserManager userManagerWithWebService = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWebService.getUserInfo());

        UserManager userManagerWithWS = new UserManager(webServiceProvider);
        System.out.println(userManagerWithWS.getUserInfo());

    }
}
