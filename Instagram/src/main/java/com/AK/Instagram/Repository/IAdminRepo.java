package com.AK.Instagram.Repository;


import com.AK.Instagram.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin,Long> {
}