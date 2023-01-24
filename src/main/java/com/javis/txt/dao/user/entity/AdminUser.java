package com.javis.txt.dao.user.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "AdminUser")
@NoArgsConstructor
public class AdminUser {

    @Id
    @Column(name = "id", nullable = false)
    private String id = "";

    @Column(name = "password", nullable = false)
    private String password = "";

    public AdminUser(String id, String password) {
        this.id = id;
        this.password = password;
    }
}
