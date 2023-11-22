package com.AK.Instagram.Repository;


import com.AK.Instagram.Model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Integer> {
}