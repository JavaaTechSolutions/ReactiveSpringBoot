package com.jts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jts.Post;
import com.jts.repository.PostRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public Flux<Post> findAll() {
		return postRepository.findAll();
	}
	
	public Mono<Post> findById(long id) {
		return postRepository.findById(id);
	}
	
	public Mono<Post> save(Post post) {
		return postRepository.save(post);
	}
	
	public Mono<Void> deleteById(long id) {
		return postRepository.deleteById(id);
	}
	
}
