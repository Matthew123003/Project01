package Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

    User findByUsername(String username);

}