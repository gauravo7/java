package com.example.restservice.about;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AboutController {

	@GetMapping("/about")
	public About about(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new About(200,"<h2>This is About Page Content</h2>",True);
	}
}
