package novel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class TestController {
	
	@GetMapping("")
	public String test() {
		return "index";
	}
	
}
