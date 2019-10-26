package com.example.aviasales2.service;

import com.example.aviasales2.entity.Comments;

import java.util.List;

public interface CommentsService {
    Comments save(Comments comments);
    List<Comments> findAll();
    String deleteById(long id);
}
