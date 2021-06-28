package esprit.gestionOuvrages.services;

	

import esprit.gestionOuvrages.model.Users;
import esprit.gestionOuvrages.repository.UsersRepository;

import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Service;

	@Service
	public class UserService extends AbstractUserService<Users, Long> {

	    @Autowired
	    private UsersRepository usersRepository;

	    @Override
	    protected JpaRepository<Users, Long> getRepository() {
	        return usersRepository;
	    }
	    
	    
	    //get themes by keyword 
	    public List<Users> findByKeyword (String keyword)
	    { 
	    	return usersRepository.findByKeyword(keyword);
	    }


		public List<Users> getAll() {
			// TODO Auto-generated method stub
			return usersRepository.findAll();
		}
	    
	      

}
