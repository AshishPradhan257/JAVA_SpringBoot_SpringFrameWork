package com.ioc.coupling;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCExample {

    public static void main(String[] args) {

        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationLooseCouplingExample.xml");
                //by spring framework this can be done directly, without providing the dependency!

//                UserDataProvider databaseProvider = new UserDatabaseProvider();
//                UserManager userManagerWithDB = new UserManager(databaseProvider);
                UserManager userManagerWithDB =
                        (UserManager) context.getBean("userManagerWithUserDataProvider");
                System.out.println(userManagerWithDB.getUserInfo());

//                UserDataProvider webServiceProvider = new WebServiceDataProvider();
//                UserManager userManagerWithWebService = new UserManager(webServiceProvider);

                UserManager userManagerWithWebService =
                    (UserManager) context.getBean("userManagerWithWebServiceProvider");
                System.out.println(userManagerWithWebService.getUserInfo());



            }
        }

