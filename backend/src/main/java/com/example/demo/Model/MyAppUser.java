//connect to DB file(and maybe store data)
package com.example.demo.Model;

import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter // hogy ki tudjam ovlasni az adatokat
@Entity // csinalj egy táblát az adatbázisba
public class MyAppUser {
    @Id // primary key (közvelten az alatta lévő dekralált valtozóra lesz érvényes!)
    @GeneratedValue(strategy = GenerationType.AUTO) // mindegyikhez hozzá rendel automatikus egy szamot
                                                    // sorrenbe(1.2.3.4)
    private Long id;
    private String username;
    private String email;
    private String password;

    // getter and setter shiiiiiittsss
    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
