package com.AK.Instagram.Repository;


import com.AK.Instagram.Model.Follow;
import com.AK.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFollowRepo extends JpaRepository<Follow,Integer> {
    List<Follow> findByCurrentUserAndCurrentUserFollower(User targetUser, User follower);
}