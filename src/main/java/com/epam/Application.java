package com.epam;

import com.epam.model.Account;

public class Application {
    public static void main(String[] args) {
        System.out.println("*** START ***");

        Account account = Account.newBuilder()
                .withToken("Token")
//                .withUserId("UserId") //Excluded to check
                .withDetails_bookingId(1L)
                .withDetails_SubData_data("subData")
//                .withDetails_SubData_hash("hashValue") //Excluded to check
                .build();

        System.out.println("Account = " + account.toString());
        System.out.println("*********** Account in XML ****************");
        System.out.println(account.toXml());
        System.out.println("*******************************************");


        String mes = Account.newBuilder()
                .withToken("TokenTest")
                .withUserId("UserIdTest")
                .withDetails_bookingId(777L)
                .withDetails_SubData_hash("hashValueTest")
                .build()
                .toXml();
        System.out.println("*********** Account 2 in XML ****************");
        System.out.println(mes);
        System.out.println("*******************************************");
    }
}
