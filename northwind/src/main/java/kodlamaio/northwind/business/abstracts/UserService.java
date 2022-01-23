package kodlamaio.northwind.business.abstracts;

import java.util.List;


import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.User;
import kodlamaio.northwind.entities.dtos.UserWithEmailDto;

public interface UserService {
	
	
	Result add(User user);
	
	DataResult< User> findByEmail(String userName);
	
	
	DataResult<List<User>> getAll();
	
	
	DataResult<List<User>> getAll(int pageNo,int pageSize);
	
	
	
	
	
	

	


}
