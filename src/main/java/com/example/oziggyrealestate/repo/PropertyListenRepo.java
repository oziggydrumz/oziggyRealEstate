package com.example.oziggyrealestate.repo;

import com.example.oziggyrealestate.model.PropertyListen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyListenRepo extends JpaRepository<PropertyListen,Long> {
}
