package com.first_boot.spring;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstApplication {

	@RequestMapping("/sendMail")
	String index() {
		// PlanTextEmailSender p = new PlanTextEmailSender();
		return PlanTextEmailSender.sendMail();
	}

	@RequestMapping("/loginCheck")  
	    //read the provided form data  
	    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model m)  
	    {
		if(pass.equals("admin"))  
        {  
            String msg="Hello "+ name;  
            //add a message to the model  
            m.addAttribute("message", msg);  
            return "Welcome back " +name;  
        }  
        else  
        {  
            String msg="Sorry "+ name+". You entered an incorrect password";  
            m.addAttribute("message", msg);  
            return "errorpage";  
        
	    }
	    }
}
