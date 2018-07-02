package ua.project.pet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final String HI = "Hi";

	@RequestMapping("/hello")
	public String sayHi(){
		return HI;
	}
}
