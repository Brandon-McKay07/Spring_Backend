package cbfsd.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cbfsd.com.entity.User;


public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("select u from User u where u.email=:email and u.password = :password")
	public List<User> signIn(@Param("email") String email, @Param("password") String password);
	
}
