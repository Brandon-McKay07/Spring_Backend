package cbfsd.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cbfsd.com.entity.Admin;






//@Repository * Remember B it Wouldn't let me put this if it doesn't connect


public interface AdminsRepository  extends JpaRepository<Admin, Integer>{

	
	@Query("select ad from Admin ad where ad.email = :emailname and ad.password = :pass")
	public Admin signIn(@Param("emailname") String email, @Param("pass") String password);
	
}
