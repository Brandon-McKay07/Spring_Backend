package cbfsd.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cbfsd.com.entity.Order;





public interface OrdersRepository extends JpaRepository<Order , Integer> {

}
