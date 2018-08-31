package swatzshop.classes;

import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import swatzshop.classes.service.UserService;
import swatzshop.classes.model.User;

@Controller
public class UserController {
	private UserService userService;

	@Autowired
	@Qualifier(value = "userService")
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "homePage";
	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String registration() {
		return "registration";
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Response addUser(@RequestParam(required = true) String firstname,
			@RequestParam(required = true) String lastname, @RequestParam(required = true) String email,
			@RequestParam(required = true) String password, @ModelAttribute User user) {
		Response response = new Response();
		try {
			if (user!=null) {
				user.setFirstname(firstname);
				user.setLastname(lastname);
				user.setEmail(email);
				user.setPassword(password);
				userService.addUser(user);
				response.setResponseBody(user);
				response.setValidated(true);
			} else {
				response.setValidated(false);
			}
		} catch (Exception ex) {
			System.out.println("exception occured!!");
		}
		return response;
	}

	/*@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public @ResponseBody String addUser(@RequestParam(required = true) String firstname,
			@RequestParam(required = true) String lastname, @RequestParam(required = true) String email,
			@RequestParam(required = true) String password, @ModelAttribute("userObject") User user) {
		System.out.println("hello-->" + firstname);
		return "success";
	}*/
}
