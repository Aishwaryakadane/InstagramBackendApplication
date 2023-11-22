package com.AK.Instagram.Repository;


import com.AK.Instagram.Model.AuthenticationToken;
import com.AK.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthenticationRepo extends JpaRepository<AuthenticationToken,Long> {


    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);
}