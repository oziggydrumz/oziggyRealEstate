package com.example.oziggyrealestate.repo;

import com.example.oziggyrealestate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
