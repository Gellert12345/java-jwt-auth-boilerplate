//connect to DB file(and maybe store data)
package com.Model;

import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Getter // hogy ki tudjam ovlasni az adatokat
@Entity // csinalj egy táblát az adatbázisba
public class MyAppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
