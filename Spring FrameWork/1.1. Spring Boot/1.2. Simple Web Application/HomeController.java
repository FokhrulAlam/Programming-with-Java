package com.fokhrul.SimpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is the controller in our server, that deals with the requests.
 * GET, POST, PUT, DELETE
 *
 */

@Controller		
public class HomeController {
	
	/**
	 * When a request comes for home, this method will be used
	 */
	@RequestMapping("home")
	public String home() {
		/**
		 * By default, any jsp file should should be kept inside webapp folder.
		 * Spring boot will understand the file is in the webapp folder.
		 * If we keep it in any other folder, we have to change the configuration ourselves.
		 */
		return "home.jsp";
		
	}
}
