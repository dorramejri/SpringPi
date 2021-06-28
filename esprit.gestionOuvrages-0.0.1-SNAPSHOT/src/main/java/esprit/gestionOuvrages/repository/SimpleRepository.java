package esprit.gestionOuvrages.repository;

import java.util.List;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import esprit.gestionOuvrages.model.Simple;

@Repository
public interface SimpleRepository extends JpaRepository<Simple, Long> {
	
	
	@Query(value="select * from simple where description like %:keyword% or promo like %:keyword%", nativeQuery=true)
	List<Simple> findByKeyword(@Param("keyword") String keyword);
	
		
	
}
