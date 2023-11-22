package com.AK.Instagram.Repository;


import com.AK.Instagram.Model.Like;
import com.AK.Instagram.Model.Post;
import com.AK.Instagram.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ILikeRepo extends JpaRepository<Like,Integer> {

    List<Like> findByInstaPostAndLiker(Post instaPost, User liker);

    List<Like> findByInstaPost(Post validPost);
}