package com.jts.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.jts.Post;

public interface PostRepository extends R2dbcRepository<Post, Long> {

}
