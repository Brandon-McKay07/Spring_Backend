package cbfsd.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cbfsd.com.repository.CartRepository;



@Service
public class CartService {

	
	
	@Autowired
	CartRepository cartRepository;
	
}
