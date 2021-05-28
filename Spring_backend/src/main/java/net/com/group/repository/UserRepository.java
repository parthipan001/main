package net.com.group.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.com.group.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
