package esprit.gestionOuvrages.services;
 
import esprit.gestionOuvrages.model.Simple;
import esprit.gestionOuvrages.repository.SimpleRepository;


import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Service;

	@Service
	public class SimpleService {

	    @Autowired
	    private SimpleRepository simpleRepository;

//	    @Override
//	    protected JpaRepository<Simple, Long> getRepository() {
//	        return simpleRepository;
//	    }
//	    
	    
	    //get themes by keyword 
	    public List<Simple> findByKeyword (String keyword)
	    { 
	    	return simpleRepository.findByKeyword(keyword);
	    }
	    


}
