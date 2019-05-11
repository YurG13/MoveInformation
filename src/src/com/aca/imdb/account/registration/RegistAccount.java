package com.aca.imdb.account.registration;

import java.util.Scanner;

public class RegistAccount {
    Registration registration = new Registration();
    Scanner scanner = new Scanner(System.in);
    private String account;
    private String name;
    private String surname;
    private String password;

    public void registr() {
        System.out.println("Admin or User");
        account = scanner.nextLine();

        switch (account) {
            case "Admin" :
                registrAdmin();
            case "User" :
                registrUser();
                default:
                    System.out.println("Sxal");
                    break;
        }
    }

    public void registrAdmin() {
        System.out.print("Enter Your name");
        name = scanner.nextLine();

        System.out.print("Enter Your surname");
        surname = scanner.nextLine();

        System.out.print("Enter Your password");
        password = scanner.nextLine();

        registration.rAdmin(name, surname, password);
    }
    public void registrUser() {
        System.out.print("Enter Your name");
        name = scanner.nextLine();

        System.out.print("Enter Your surname");
        surname = scanner.nextLine();

        System.out.print("Enter Your password");
        password = scanner.nextLine();

        registration.rUser(name, surname, password);
    }

}
