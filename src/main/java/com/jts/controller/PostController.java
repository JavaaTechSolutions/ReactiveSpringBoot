package com.jts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.jts.Post;
import com.jts.service.PostService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class PostController {

	@Autowired
	private PostService postServices;

	@GetMapping("/findAll")
	@ResponseStatus(HttpStatus.OK)
	public Flux<Post> findAllPosts() {
		return postServices.findAll();
	}

	@GetMapping("/findById/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Mono<Post> findById(@PathVariable("id") int id) {
		return postServices.findById(id);
	}

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<Post> createPost(@RequestBody Post post) {
		return postServices.save(post);
	}
}
