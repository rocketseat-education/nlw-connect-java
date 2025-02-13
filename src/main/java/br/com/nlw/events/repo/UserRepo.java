package br.com.nlw.events.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.nlw.events.model.User;

public interface UserRepo extends CrudRepository<User, Integer> {
    public User findByEmail(String email);  
}
