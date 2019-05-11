package com.aca.imdb.account.registration;

import com.aca.imdb.account.AccountMamory;

public class Registration extends AccountMamory {
//    AccountMamory accountMamory = new AccountMamory();

    public void rAdmin(String name, String surname, String password) {
        this.aName.add(name);
        this.aSurname.add(surname);
        this.aPassword.add(password);
    }

    public void rUser(String name, String surname, String password) {
        this.uName.add(name);
        this.uSurname.add(surname);
        this.uPassword.add(password);
    }
}
