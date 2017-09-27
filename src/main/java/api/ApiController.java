package api;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import auth.AuthService;
import data.User;

@RestController
public class ApiController {

	@Autowired
	@Qualifier("authServiceMockImpl")
	private AuthService authService;
	
    public ApiController() {
		super();
	}

	@RequestMapping("/")
    public String index() {
        return "Hi Guys! Use the correct method tu authenticate!";
    }

    @RequestMapping(path = "/user/{name}/{pass}", method = RequestMethod.GET, produces = "application/json")
    public HashMap<String, String> authUserGet(@PathVariable("name") String name, @PathVariable("name") String pass) {
    	HashMap<String, String> output = new HashMap<String, String>();
    	output.put("user", name);
    	output.put("status", "0");
    	output.put("message", "To auth use POST verb");
        return output;
    }
    
    @RequestMapping(path = "/user/{name}/{pass}", method = RequestMethod.POST, produces = "application/json")
    public HashMap<String, String> authUser(@PathVariable("name") String name, @PathVariable("name") String pass) {
    	HashMap<String, String> output = new HashMap<String, String>();
    	output.put("user", name);
    	output.put("status", "0");
    	output.put("message", "User Auth Ok");
        return output;
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST, produces = "application/json")
    public HashMap<String, String> auth(@RequestParam(value="name", required = true) String name, 
    		@RequestParam(value="pass", required = true) String pass) {
    	HashMap<String, String> output = new HashMap<String, String>();
    	
    	output.put("user", name);
    	output.put("status", "0");
    	output.put("message", "User Auth Ok 2");
    	
    	return output;
    	
    }


}