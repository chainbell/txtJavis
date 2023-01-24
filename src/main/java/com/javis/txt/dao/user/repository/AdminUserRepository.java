package com.javis.txt.dao.user.repository;

import com.javis.txt.dao.user.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminUserRepository extends JpaRepository<AdminUser, String> {
}
