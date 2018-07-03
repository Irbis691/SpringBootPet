package ua.project.pet;

import com.jcabi.aspects.Loggable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Loggable
public class Controller {

	private static final String HI = "Hi";

	@RequestMapping("/hello")
	public String sayHi(){
		return HI;
	}
}
