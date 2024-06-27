package com.jts;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Post {

	@Id
	private long id;

	private String title;

	private String comment;

}
