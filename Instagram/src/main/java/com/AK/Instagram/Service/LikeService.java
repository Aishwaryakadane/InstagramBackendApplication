package com.AK.Instagram.Service;


import com.AK.Instagram.Model.Like;
import com.AK.Instagram.Model.Post;
import com.AK.Instagram.Model.User;
import com.AK.Instagram.Repository.ILikeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LikeService {

    @Autowired
    ILikeRepo likeRepo;

    public String addLike(Like like) {

        likeRepo.save(like);
        return "Insta post liked successfully!!!";

    }

    public boolean isLikeAllowedOnThisPost(Post instaPost, User liker) {

        List<Like> likeList = likeRepo.findByInstaPostAndLiker(instaPost,liker);
        return likeList!=null && likeList.isEmpty();
    }

    public Integer getLikeCountForPost(Post validPost) {
        return likeRepo.findByInstaPost(validPost).size();
    }


    public Like findLike(Integer likeId) {
        return likeRepo.findById(likeId).orElse(null);
    }

    public void removeLike(Like like) {
        likeRepo.delete(like);
    }
}