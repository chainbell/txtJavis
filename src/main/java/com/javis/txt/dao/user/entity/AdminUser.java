package com.javis.txt.dao.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "AdminUser")
public class AdminUser {

    @Id
    @Column(name = "id", nullable = false)
    private String id = "";

    @Column(name = "password", nullable = false)
    private String password = "";

}
