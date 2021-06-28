package esprit.gestionOuvrages.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import esprit.gestionOuvrages.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

	@Query(value="select * from users where name like %:keyword% or email like %:keyword1% or address like %:keyword%", nativeQuery=true)
	List<Users> findByKeyword(@Param("keyword") String keyword);
	

	
}
