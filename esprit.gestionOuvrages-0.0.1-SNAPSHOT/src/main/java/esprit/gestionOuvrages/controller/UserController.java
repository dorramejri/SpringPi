package esprit.gestionOuvrages.controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import esprit.gestionOuvrages.model.Users;
import esprit.gestionOuvrages.services.UserService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;



@RestController
@RequestMapping("/users")
public class UserController {

    private UserService userService;

    @Autowired
    public void setuserService(UserService userService) {
        this.userService = userService;
    }
     
    
    @RequestMapping(method =RequestMethod.POST, value="/add")
    
    public Users create(@RequestBody Users candidat) {
        return userService.save(candidat);
    }

    @RequestMapping(method =RequestMethod.GET, value="/get")
    public List<Users> get() {
    	
  
        return  userService.getAll();

		
    }  
    
    public Users update(Long id, Users newu) {
    	Users e= userService.get(id) ; 
        if (e!=null) {
            userService.delete(id);
            return userService.save(newu);
        } else
            return null;
    }
    @RequestMapping(method =RequestMethod.PUT, value="/edit/{id}")
    public String updateu(@PathVariable Long id,
                                                   @RequestBody Users candidat) {
  
    	if(update(id,candidat)!=null)
    	
        return "done !";
        else 
        	
        return "Opps!";	
    }

    @RequestMapping(method =RequestMethod.DELETE, value="/delete/{id}")

    public String deleteu(@PathVariable Long id) {
    	
    	if(userService.get(id)!=null)
    	{
    		 userService.delete(id);
    		 return "done !";
    	}
            
            else 
            	
            	return "opss !";	
    }

   
 


}
