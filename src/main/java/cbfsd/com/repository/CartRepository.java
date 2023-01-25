package cbfsd.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbfsd.com.entity.Cart;



public interface CartRepository extends JpaRepository<Cart, Integer> {

}
