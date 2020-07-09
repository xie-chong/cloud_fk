package org.crazyit.cloud;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@RequestMapping(value = "/person/{personId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findPerson(@PathVariable("personId") Integer personId) {
		Person p = new Person();
		p.setId(personId);
		p.setName("Crazyit");
		p.setAge(30);
		return p;
	}
}
