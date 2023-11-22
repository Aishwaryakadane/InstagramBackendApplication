package com.AK.Instagram.Repository;


import com.AK.Instagram.Model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<Comment,Integer> {
}