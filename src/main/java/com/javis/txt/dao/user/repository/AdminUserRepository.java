package com.javis.txt.dao.user.repository;

import com.javis.txt.dao.user.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;

public interface AdminUserRepository extends JpaRepository<AdminUser, String> {

    AdminUser findByIdAndPassword(String id, String password);

}
