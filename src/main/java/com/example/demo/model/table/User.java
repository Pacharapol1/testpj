package com.example.demo.model.table;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString

@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String email;

    @Column
    private String address;

    @Column
    private int phonenumber;

    @Column
    private String major;

}


